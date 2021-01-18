package queue;

/**
 *
 * @author mohammadi
 */

class Node
{
    int data;
    Node next;
}

public class QueueUsingLinkedList 
{
    Node front,rear;
    public QueueUsingLinkedList()
    {
        front = rear = null;
    }
    
    public void enqueue(int x)
    {
        Node temp = new Node();
        if(temp == null)
        {
            System.out.println("Queue is Full\n");
        }else
        {
            temp.data = x;
            temp.next = null;
            if(front == null)
            {
                front = rear = temp;
            }else
            {
                rear.next = temp;
                rear = temp;
            }
        }
    }
    
    public int dequeue()
    {
        int x = -1;
        Node temp;
        if(front == null)
        {
            System.out.println("Queue is Empty\n");
        }else
        {
            x = front.data;
            front = front.next;
        }
        
        return x;
    }
    
    public void display()
    {
        Node p = front;
        while(p != null)
        {
            System.out.printf("%d ",p.data);
            p = p.next;
        }
        System.out.println("");
    }
    
}
