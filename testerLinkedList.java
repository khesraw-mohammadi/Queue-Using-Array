package queue;

/**
 *
 * @author mohammadi
 */
public class testerLinkedList 
{
    public static void main(String[] args)
    {
        QueueUsingLinkedList linkedList = new QueueUsingLinkedList();
        linkedList.enqueue(10);
        linkedList.enqueue(20);
        linkedList.enqueue(30);
        linkedList.enqueue(40);
        linkedList.enqueue(50);
        
        linkedList.display();
        
        linkedList.dequeue();
        
        linkedList.display();
        
    }
}
