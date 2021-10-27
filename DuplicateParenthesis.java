/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicateparenthesis;

import java.util.*;

        
/**
 *
 * @author mirza
 */

public class DuplicateParenthesis {

    public static void main(String[] args) {
        //string input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a something: ");  
        String myString= input.nextLine(); 
        System.out.println("You have entered: " + myString);
        int sizeOfStack = myString.length();
        System.out.println("Size of string is: " + sizeOfStack);
        
        Stack stack = new Stack(sizeOfStack);
        
        //for ( and )
        int bracket1=0,bracket2=0;
        //for [ and ]
        int bracket3=0,bracket4=0;
        //for { and }
        int bracket5=0,bracket6=0;
        
        for(int i=0; i<sizeOfStack;i++) {
            char temp = myString.charAt(i);
            stack.push(temp);
            if(temp == '(')
                bracket1++;
            if(temp == ')')
                bracket2++;
            if(temp == '[')
                bracket3++;
            if(temp == ']')
                bracket4++;
            if(temp == '{')
                bracket5++;
            if(temp == '}')
                bracket6++;
        }
        
        if (bracket1>1)
            System.out.println("( is occuring more than one time");
        if (bracket2>1)
            System.out.println(") is occuring more than one time");
        if (bracket3>1)
            System.out.println("[ is occuring more than one time");
        if (bracket4>1)
            System.out.println("] is occuring more than one time");
        if (bracket5>1)
            System.out.println("{ is occuring more than one time");
        if (bracket6>1)
            System.out.println("} is occuring more than one time");
    }
}