package com.jbwang.stackqueue;

/**
 * 时间复杂度为O(1)
 * Created by jbwang0106 on 2017/5/8.
 */
public class StackY {

    private int maxSize;
    private char [] stack;
    private int top;

    public StackY(int maxSize) {
        this.maxSize = maxSize;
        stack = new char[maxSize];
        top = -1;
    }

    public char push(char c) {
        return stack[++top] = c;
    }

    public char pop() {
        return stack[top--];
    }

    public char peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == (maxSize-1));
    }

}
