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
    public ListNode oddEvenList(ListNode head) 
    {
        if(head == null || head.next == null)
            return head;
        
        ListNode odd = head, even = head.next;
        ListNode evenhead = head.next;         /*this is needed since at the end last 
                                                 odd should point to first even */
       
        while(even != null && even.next != null)   //since we know even is one step ahead of odd
        {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenhead;        //last odd element's next is first even element
        return head;           //since odd = head therefore return hed
    }
}