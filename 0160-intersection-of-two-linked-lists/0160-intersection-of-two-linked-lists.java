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

//Finding difference(d) in length and moving the longer LL by d

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA, temp2 = headB;
        int t1 = 0, t2 = 0;
        while(temp1 != null) {
            temp1 = temp1.next;
            t1++;
        }
        while(temp2 != null) {
            temp2 = temp2.next;
            t2++;
        }
        int d = Math.abs(t1 - t2);
        temp1 = headA; 
        temp2 = headB;
        while(d != 0) {
            if(t1 > t2) {
                temp1 = temp1.next;
                d--;
            }
            else {
                temp2 = temp2.next;
                d--;
            }
        }
        while(temp1 != null & temp2 != null)
        {
            if(temp1 == temp2)
                return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}