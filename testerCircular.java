/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
