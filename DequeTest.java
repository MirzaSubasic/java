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
public class DequeTest {
    
    public static void main(String[] args) {
        Deque test = new Deque(5);
        
        //queue elements: 10
        test.insertFront(10);
        System.out.println("inserted: " + test.peekFront());
        //queue elements: 20 10
        test.insertFront(20);
        System.out.println("inserted: " + test.peekFront());
        //queue elements: 10
        System.out.println("removed: " + test.removeFront());

        System.out.println();
        
        //queue elements: 10 30
        test.insertRear(30);
        System.out.println("inserted: " + test.peekLast());
        //queue elements: 10 30 40
        test.insertRear(40);
        System.out.println("inserted: " + test.peekLast());
        //queue elements: 10 30
        System.out.println("removed: " + test.removeRear());
        
        System.out.println("front " + test.peekFront());
        System.out.println("last " + test.peekLast());
        
        System.out.println();
        
        /*System.out.print("Removing from rear elements:  ");
        while (!test.isEmpty()) {
            System.out.print(test.removeRear() + "  ");
        }*/
        
        System.out.print("Removing from front elements:  ");
        while (!test.isEmpty()) {
            System.out.print(test.removeFront() + "  ");
        }
        System.out.println();
    } 
    
}
