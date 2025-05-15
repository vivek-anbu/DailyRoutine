/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution
{
    public static Node sortList(Node head) {
       
       Node zero=new Node(-1);
       Node first=new Node(-1);
       Node second=new Node(-1);

       Node zeroHead=zero;
       Node firstHead=first;
       Node secondHead=second;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==0)
            {
                zero.next=temp;
                zero=zero.next;
            }
            else if(temp.data==1)
            {
                first.next=temp;
                first=first.next;
            }
            else if(temp.data==2)
            {
                second.next=temp;
                second=second.next;
            }
            temp=temp.next;
        }
        zero.next=firstHead.next;
        first.next=secondHead.next;
        second.next=null;
        return zeroHead.next;
    }
}
