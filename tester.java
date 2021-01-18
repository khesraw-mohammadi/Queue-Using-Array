package queue;

/**
 *
 * @author mohammadi
 */
public class tester 
{
    public static void main(String[] args)
    {
        QueueUsingArray queue = new QueueUsingArray(20);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
    }
    
}
