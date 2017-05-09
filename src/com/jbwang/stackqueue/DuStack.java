package com.jbwang.stackqueue;

/**
 * 4.3
 * 使用DuQueue实现stack
 * Created by jbwang0106 on 2017/5/9.
 */
public class DuStack {

    private DuQueue stackQueue;

    public DuStack(int size) {
        stackQueue = new DuQueue(size);
    }

    public void push(long value) {
        stackQueue.insertRight(value);
    }

    public long pop() {
        return stackQueue.removeRight();
    }

    public long peek() {
        return stackQueue.peekRight();
    }

    public boolean isEmpty() {
        return stackQueue.isEmpty();
    }

    public boolean isFull() {
        return stackQueue.isFull();
    }


}
