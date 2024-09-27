/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

//OPTIMAL APPROACH

public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode t1 = headA, t2 = headB;
        if(headA == null || headB == null)
            return null;
        while(t1 != t2)
        {
            t1 = t1.next;
            t2 = t2.next;
            
            /*this alone is covering the case where there is no intersection 
            and both t1 t2 reach to null*/
            if(t1 == t2)
                return t1;
            
            if(t1 == null)
                t1 = headB;
            if(t2 == null)
                t2 = headA;
        }
        return t1;
    }
}