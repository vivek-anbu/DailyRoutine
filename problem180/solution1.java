/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        
        Node slow=head;
        Node fast=head;
        
        int count=0;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                slow=slow.next;
                count++;
                while(slow!=fast)
                {
                    slow=slow.next;
                    count++;
                }
                return count;
            }
            
            
        }
        return 0;
    }
}
