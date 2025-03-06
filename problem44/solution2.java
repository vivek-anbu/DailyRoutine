
class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    
    StackNode top =null;

    // Function to push an integer into the stack.
    void push(int a) {
            
            StackNode newNode=new StackNode(a);
            newNode.next=top;
            top=newNode;
    }

    // Function to remove an item from top of the stack.
    int pop() {
            
            if(top==null)
            {
                return -1;
            }
            int temp=top.data;
            top=top.next;
            return temp;
    }
}
