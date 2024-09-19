/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public ListNode detectCycle(ListNode head) 
    {
        ListNode hare = head, turtle = head;
        
        //detecting the loop
        while(hare != null && hare.next != null)
        {
            hare = hare.next.next;
            turtle = turtle.next;
            
            if(hare == turtle)    //detecting the loop
            {
                turtle = head;    //if loop, leave H at collision point and move T to head
                while(hare != turtle)
                {
                    // move H&T one by one, next point of collision will be start of loop
                    hare = hare.next;     
                    turtle = turtle.next;
                }
                return hare;
                
            }
        }
        return null;
    }
}