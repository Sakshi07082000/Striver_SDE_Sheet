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
    public ListNode get_kth_node(ListNode head, int k, int l)
    {
        ListNode temp = head;
        k = k%l;
        int kth = l - k -1;
        while(temp != null && kth>0)
        {
            temp = temp.next;
            kth--;
        }
        return temp;
    }
    
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head == null || head.next == null || k == 0) 
            return head;
        
        ListNode tail = head;
        int len = 1;
        while(tail.next != null)
        {
            tail = tail.next;
            len++;
        }

        if(k%len == 0)
            return head;
        
        k = k%len;
        
        ListNode newtail = get_kth_node(head, k, len);
        tail.next = head;
        head = newtail.next;
        newtail.next = null;
        
        return head;
    }
}