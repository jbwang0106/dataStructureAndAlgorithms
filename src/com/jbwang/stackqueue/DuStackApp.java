package com.jbwang.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/9.
 */
public class DuStackApp {

    public static void main(String[] args) {
        DuStack theStack = new DuStack(5); // make new stack
        System.out.println("Stack is Empty : " + theStack.isEmpty());
        System.out.println("Stack is Full : " + theStack.isFull());
        theStack.push(20); // push items onto stack
        theStack.push(40);
        theStack.push(60);
//        theStack.push(80);
//        theStack.push(90);
        System.out.println("Stack is Empty : " + theStack.isEmpty());
        System.out.println("Stack is Full : " + theStack.isFull());
        while (!theStack.isEmpty()) // until it's empty,
        { // delete item from stack
            long value = theStack.pop();
            System.out.print(value); // display it
            System.out.print(" ");
        } // end while
        System.out.println("");
    }
}
