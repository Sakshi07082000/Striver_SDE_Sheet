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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        //one node ahead of the actual head of sum LL
        ListNode sumhead = new ListNode(); 
        ListNode temp = sumhead; 
        int carry = 0;
        while( l1 != null || l2 != null || carry == 1) 
        {
            int sum = 0; 
            if(l1 != null) 
            {
                sum += l1.val; 
                l1 = l1.next; 
            }
            if(l2 != null) 
            {
                sum += l2.val; 
                l2 = l2.next; 
            }
            
            //first iteration- (2+5)=7, carry=7/10=0
            //second iteration- (6+4)=10, carry=10/10=1
            sum += carry; 
            carry = sum / 10; 
            
            //node of new sum LL
            //first iteration- 7%10 = 7
            //second iteration- 10%10 = 0
            ListNode node = new ListNode(sum % 10); 
            //temp/sumhead points to first node 'node' of sum LL
            temp.next = node;
            //temp moves to first node of sum LL
            temp = temp.next; 
        }
        return sumhead.next;
    }
}