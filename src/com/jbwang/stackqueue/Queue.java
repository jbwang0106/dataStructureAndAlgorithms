package com.jbwang.stackqueue;

import java.lang.annotation.Retention;

/**
 * 使用数组实现队列
 * 时间复杂度为O(1)
 * Created by jbwang0106 on 2017/5/8.
 */
public class Queue {

    /**
     * 队列的大小
     */
    private int maxSize;

    /**
     * 队头
     */
    private int front;

    /**
     * 队尾
     */
    private int rear;

    /**
     * 队列中的数据个数
     */
    private int nItems;

    /**
     * 队列使用的数组
     */
    private long [] queue;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        front = 0;
        rear = -1;
        nItems = 0;
        queue = new long[maxSize];
    }

    /**
     * 向队列中插入元素
     * @param value
     * @return 元素插入的位置
     */
    public long insert(long value) {
        if (rear == (maxSize-1))
            rear = -1;
        queue[++rear] = value;
        nItems++;
        return rear;
    }

    /**
     * 队列最开始的元素移除并返回
     * @return
     */
    public long remove() {
        long temp = queue[front++];
        if(front == maxSize)
            front = 0;
        nItems--;

        return temp;
    }

    /**
     * 查看队列最开始的元素
     * @return
     */
    public long peek() {
        return queue[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

    /**
     * 4.1 查看queue内所有的元素
     *     按照插入的顺序显示
     * @return
     */
    public long[] displayQueue() {
        long [] disQueue = new long[nItems];
        if(front <= rear) {
            for (int i = 0;i < nItems; i++) {
                disQueue[i] = queue[i+front];
            }
        } else {
            int i;
            for (i = 0; i < (maxSize-front); i++) {
                disQueue[i] = queue[i+front];
            }

            int k = 0;
            for (int j = i; j < nItems; j++) {
                disQueue[j] = queue[k++];
            }
        }

        return disQueue;
    }

    /**
     * 4.1 查看queue内所有的元素
     *     按照插入的顺序显示
     * @return
     */
    public void displayQueue01() {
        if (nItems == 0) {
            System.out.println("队列为空");
            return;
        }
        if(front <= rear) {
            for (int i = front;i <= rear; i++) {
                System.out.println(queue[i]);
            }
            System.out.println(" ");
        } else {
           
            for (int i = front; i < maxSize; i++) {
                System.out.println(queue[i]);
            }
            
            for (int j = 0; j <= rear; j++) {
                System.out.println(queue[j]);
            }
            System.out.println(" ");
        }

        
    }
}

