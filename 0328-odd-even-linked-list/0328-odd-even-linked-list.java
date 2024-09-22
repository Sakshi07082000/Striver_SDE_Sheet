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
        ListNode temp = head;
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(head == null || head.next == null)
            return head;
        
        while(temp != null && temp.next != null)   //for odd pointers
        {
            ans.add(temp.val);
            temp = temp.next.next;
        }
        if(temp!=null)    //if any element is left
            ans.add(temp.val);
        
        temp = head.next;
        while(temp != null && temp.next != null)    //for even pointers
        {
            ans.add(temp.val);
            temp = temp.next.next;
        }
        if(temp!=null)   //if any element is left
            ans.add(temp.val);
        
        temp = head;
        int i = 0;
        while(temp != null)   // replacing the val of temp with ans elements
        {
            temp.val = ans.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
}