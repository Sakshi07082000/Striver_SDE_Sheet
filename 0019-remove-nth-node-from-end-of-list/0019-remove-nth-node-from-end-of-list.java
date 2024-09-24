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

/*If nth node from end = N, then
nth node from start = size - N + 1*/

class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int size = 0;
        ListNode curr = head;
        
        if(head.next == null)
            return null;
        
        while(curr != null)   //find size of the list
        {
            curr = curr.next;   //1 2 3 4 5 null(it will go till null then while is checked)
            size ++;            //0 1 2 3 4 5
        }
        
        int N = size - n;  // N will be one place prev to nth node from end
        
        if(n == size)
            return head.next;    //if n=size then it will be head of LL from behind
        
        curr = head;
        int i=0;
        while(i < N-1)
        {
            curr = curr.next;
            i ++;
        }
        curr.next = curr.next.next;
        return head;
    }
}