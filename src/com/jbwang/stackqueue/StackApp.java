package com.jbwang.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/8.
 */
public class StackApp {

    public static void main(String [] args) {
        StackX stack = new StackX(10);

        //向栈中压入数据
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);
        
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();


    }

}
