/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

//Without using hashmap. Inserting copy in between original

class Solution 
{
    public Node copyRandomList(Node head) 
    {
        //INSERTING COPY node in between the original nodes
        Node temp = head;
        while(temp != null)
        {
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp = temp.next.next;
        }
        
        //CONNECTING random pointers
        temp = head;
        while(temp != null)
        {
            //marks the start of copy LL
            Node copy = temp.next;
            //case where temp's random points to null
            if(temp.random != null)  
                copy.random = temp.random.next;
            else
                copy.random = null;
            temp = temp.next.next;
        }
        
        //CONNECTING NEXT pointers
        Node dummy = new Node(-1), Finalcopy = dummy;
        temp = head;
        while(temp != null)
        {
            //dummy & Finalcopy are sitting one node ahead of head
            //connecting copy LL(temp.next) to Finalcopy
            Finalcopy.next = temp.next;
            //connecting temp to its original next and not copy
            temp.next = temp.next.next;
            //Finalcopy which is originally on dummy goes to next
            Finalcopy = Finalcopy.next;
            //temp goes to original next
            temp = temp.next;
        }
        return dummy.next;
    }
}