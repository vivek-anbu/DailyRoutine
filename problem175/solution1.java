// User function Template for Java

class Solution {
    public Node insertAtBegining(Node head, int x) {
       
       if(head!=null){
        Node newNode=new Node(x);
        newNode.next=head;
        head=newNode;
       }
      
        return head;
    }
}

