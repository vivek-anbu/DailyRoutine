class MyQueue {
    Stack<Integer> s1,s2;
    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void push(int x) {
        s2.push(x);
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        Stack<Integer> temp=s1;
        s1=s2;
        s2=temp;

    }
    
    public int pop() {
        return s2.pop();

    }
    
    public int peek() {
        return s2.peek();
    }
    
    public boolean empty() {
        
        return s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
