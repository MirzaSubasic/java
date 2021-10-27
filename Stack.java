/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicateparenthesis;

/**
 *
 * @author mirza
 */
public class Stack {
    private int size, top;
    private char[] stackArray;

    public Stack (int _size){
        size = _size;
        stackArray = new char[size];
        top = - 1;
    }

    public void push (char insert){
        if(isFull())
            System.exit(0);
        stackArray[++top]=insert;
    }

    public char pop(){
        if (top-- == -1)
            System.exit(0);
        return stackArray[top--];
    }

    public char peek(){
        return stackArray[top];
    }
    
    public boolean isFull() {
        return top==size-1;
    }
    
    public boolean isEmpty(){
        return top==-1;
    }
}
