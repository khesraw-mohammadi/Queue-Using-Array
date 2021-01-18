package queue;

/**
 *
 * @author mohammadi
 */
public class testerCircular 
{
    public static void main(String[] args)
    {
        CircularQueueUsingArray queue = new CircularQueueUsingArray(3);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(40);
        queue.display();

    }
}
