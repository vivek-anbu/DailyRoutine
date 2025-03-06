class MyStack {
        Queue<Integer> q1,q2;

    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        while(q2.size()>0)
        {
            q1.add(q2.remove());
        }
        q2.add(x);
        while(q1.size()>0)
        {
            q2.add(q1.remove());
        }
    }
    
    public int pop() {
        
        return q2.remove();
    }
    
    public int top() {
        
        return q2.peek();
    }
    
    public boolean empty() {
        if(q2.size()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
