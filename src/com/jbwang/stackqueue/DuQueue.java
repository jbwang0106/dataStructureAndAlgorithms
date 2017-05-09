package com.jbwang.stackqueue;

import java.awt.datatransfer.MimeTypeParseException;

/** 4.2
 *  实现双端队列
 * Created by jbwang0106 on 2017/5/9.
 */
public class DuQueue {

    private int maxSize;
    private long[] duQueue;
    private int front;
    private int rear;
    private int nItems;

    public DuQueue(int maxSize) {
        this.maxSize = maxSize;
        duQueue = new long[maxSize];
        this.front = 0;
        this.rear = maxSize-1;
        this.nItems = 0;
    }

    public void insertLeft(long value) {
        if (front == 0) {
            front = maxSize;
        }
        duQueue[--front] = value;
        nItems++;
    }

    public void insertRight(long value) {
        if (rear == (maxSize-1)) {
            rear = -1;
        }
        duQueue[++rear] = value;
        nItems++;
    }

    public long removeLeft() {
        long temp = duQueue[front++];
        if(front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public long removeRight() {
        long temp = duQueue[rear--];
        if (rear == -1)
            rear = maxSize-1;
        nItems--;
        return temp;
    }

    public long peekLeft() {
        return duQueue[front];
    }

    public long peekRight() {
        return duQueue[rear];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int size() {
        return nItems;
    }

    public void display() {
        System.out.print("队列为：");
        if (nItems == 0) {
            System.out.println("空。");
            return;
        }
        if (rear >= front) {
            for (int i = front; i <= rear; i++) {
                System.out.print(duQueue[i] + " ");
            }
        } else {
            for (int i = front; i < maxSize; i++) {
                System.out.print(duQueue[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(duQueue[i] + " ");
            }
        }
        System.out.println();
    }
}
