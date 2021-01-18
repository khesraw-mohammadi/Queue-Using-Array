package queue;

/**
 *
 * @author mohammadi
 */
public class CircularQueueUsingArray 
{
       private int front;
   private int rear;
   private int size;
   private int[] queue;
   
   public CircularQueueUsingArray()
   {
       front = rear = 0;
       size = 10;
       queue = new int[10];
   }
   
   public CircularQueueUsingArray(int size)
   {
       front = rear = 0;
       this.size = size;
       queue = new int[this.size];
   }
   
   public boolean isFull()
   {
       return (rear + 1) % size == front;
   }
   
   public boolean isEmpty()
   {
       return front == rear;
   }
   
   public void enqueue(int x)
   {
       if(isFull())
       {
           System.out.println("Queue Is Full!!!");
       }else
       {
           rear = (rear + 1) % size;
           queue[rear] = x;
       }
   }
   
   public int dequeue()
   {
       int x = -1;
       if(isEmpty())
       {
           System.out.println("Queue is Empty!!!");
       }else
       {
           x = queue[++front];
       }
       
       return x;
   }
   
   public void display()
   {
       if(isEmpty())
       {
           System.out.println("Queue is Empty!!!");
       }else
       {
            for(int i = front + 1; i <= rear; i++)
            {
                System.out.printf("%d ",queue[i]);
            }
            System.out.println("");
       }
   }
}
