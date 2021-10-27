/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequetest;

/**
 *
 * @author mirza
 */
public class Deque {
    private int front, rear, size, nrOfItems;
    private long [] queue;

    public Deque(int s) {
        size = s;
        queue = new long[s];
        front = 1;
        rear = 0;
        nrOfItems = 0;
    }
    
    //inserts element at the front of queue
    //breaks if queue is full
    public void insertFront(long insert) {
        nrOfItems++;
        if (isFull())
            System.exit(0);
        front--;
        if (front<0)
            front = size-1;
        queue[front] = insert;
    }
    
    //inserts element at the end of queue
    //breaks if queue is full
    public void insertRear(long insert) {
        nrOfItems++;
        if (isFull())
            System.exit(0);
        rear++;
        queue[rear] = insert;
        if (rear == size - 1)
            rear = 0;
    }
    
    //removes front element and returnes it
    public long removeFront() {
        long temp = queue[front++];
        if (front == size)
            front = 0;
        nrOfItems--;
        return temp;
    }
    
    public long removeRear() {
        long temp = queue[rear];
        rear--;
        if (rear < 0)
            rear = size - 1;
        if (isEmpty())
            System.exit(0);
        nrOfItems--;
        return temp;
    }

    //returns last element of queue
    public long peekLast() {
        return queue[rear];
    }
    
    public long peekFront() {
        return queue[front];
    }

    //returns true if queue is empty
    public boolean isEmpty() {
        return (nrOfItems==0);
    }

    //returns true if queue is full
    public boolean isFull() {
        return (nrOfItems==size);
    }
 
}
