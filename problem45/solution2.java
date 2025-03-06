
/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

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
	   
        if(front==null)
        {
            return -1;
        }
        if(front==null)
        {
            rear=null;
        }
        int val=front.data;
        front=front.next;
        return val;
	}
}
