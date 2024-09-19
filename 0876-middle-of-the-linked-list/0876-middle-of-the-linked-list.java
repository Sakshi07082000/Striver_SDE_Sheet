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
class Solution {
    public ListNode middleNode(ListNode head) 
    {
        ListNode hare = head;
        ListNode turtle = head;
        
        while(hare != null && hare.next != null)
        
        // here if hare.next is written first then run time error
        //when hare becomes null, then code cannot find hare.next
        //therefore runtime error
            
        {
            turtle = turtle.next;
            hare = hare.next.next;
        }
        
        return turtle;
    }
}