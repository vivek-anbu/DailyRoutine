class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        if(rear==null)
        {
            rear=new QueueNode(a);
            front=rear;
        }
        else
        {
            QueueNode newNode=new QueueNode(a);
            rear.next=newNode;
            rear=newNode;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        QueueNode temp=front;
        if(temp==null)
        {
            return -1;
        }
        if(temp.next!=null)
        {
            temp=temp.next;
            int val=front.data;
            front=temp;
            return val;
        }
        else
        {
            temp=temp.next;
            int val=front.data;
            front=null;
            rear=null;
            
            return val;
        }
	}
}
