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
    public ListNode reverse(ListNode head)    //function to reverse the LL
    {
        ListNode temp = head, prev = null, front = null;
        while(temp != null)
        {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    
    public ListNode get_Kth_node(ListNode temp, int k) 
    {
        k--;
        while(temp != null && k>0) //traverse till kth node and return it
        {                          //if if k>LL.size then null is returned
            temp = temp.next;
            k--;
        }
        return temp;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        ListNode temp = head, prev = null;
        while(temp != null) //temp will traverse
        {
            ListNode knode = get_Kth_node(temp, k);
            if(knode == null)  //if no kth node, i.e., 'get_Kth_node' returns null
            {
                if(prev != null )
                    prev.next = temp;
                break;
            }
            ListNode nextnode = knode.next;
            knode.next = null;
            reverse (temp);
            if(temp == head)  //first k LL reverse case when head==temp
                head = knode;
            else
                prev.next = knode;    //here linking of reverse LL takes place
            prev = temp;
            temp = nextnode;
        }
        return head;
    }
}