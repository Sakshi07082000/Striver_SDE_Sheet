/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode reverse(ListNode head)       //function to reverse a ll
    {
        ListNode prev = null, temp = head, front;
        
        while(temp != null)
        {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    
    public ListNode midelement(ListNode head)       //function to find first mid element of a ll
    {
        ListNode hare = head, turtle = head;
        
        while(hare.next != null && hare.next.next != null)    /*first mid element is taken 
                                                             because we reverse from mid.next */
        {
            turtle = turtle.next;
            hare = hare.next.next;
        }
        return turtle;
    }
    
    public boolean isPalindrome(ListNode head) 
    {
        ListNode mid = midelement(head);
        ListNode firsthalf = head;
        ListNode secondhalf = reverse(mid.next);
        
        while(secondhalf != null)     // second half is taken since first half goes from head to null
        {
            if(firsthalf.val != secondhalf.val)   //compairing val of first and second half
            {
                return false;
            }
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return true;
    }
}