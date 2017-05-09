package com.jbwang.stackqueue;

/**
 * 4.2 使用数组实现双端队列
 * Created by jbwang0106 on 2017/5/9.
 */
public class DeQueue {

    /**
     * 队列的大小
     */
    private int maxSize;

    /**
     * 左端队列的开始
     */
    private int leftFront;

    /**
     * 左端队列的尾部
     */
    private int leftRear;

    /**
     * 右端队列的开始
     */
    private int rightFront;

    /**
     * 右端队列的尾部
     */
    private int rightRear;

    /**
     * 左端队列元素的个数
     */
    private int leftNItems;

    /**
     * 右端队列元素的个数
     */
    private int rightNItems;

    /**
     * 实现队列的数组
     */
    private long [] deQueue;

    public DeQueue(int maxSize) {
        this.maxSize = maxSize;
        this.deQueue = new long[maxSize];
        this.leftFront = 0;
        this.leftRear = -1;
        this.rightFront = 0;
        this.rightRear = -1;
        this.leftNItems = 0;
        this.rightNItems = 0;
    }

    public void insertLeft(long value) {
        if(leftRear == (maxSize-rightNItems-1))
            leftRear = -1;
        deQueue[++leftRear] = value;
        leftNItems++;
    }

    public void insertRight(long value) {
        if (rightRear == (maxSize-leftNItems-1))
            rightRear = -1;
        deQueue[++rightRear] = value;
        rightNItems++;
    }

    public long removeLeft() {
        long leftValue = deQueue[leftFront++];
        if(leftFront == leftNItems)
            leftFront = 0;
        leftNItems--;
        return leftValue;
    }

    public long removeRight() {
        long rightValue = deQueue[rightFront++];
        if(rightFront == rightNItems)
            rightFront = 0;
        rightNItems--;
        return rightValue;
    }

    public boolean isFull() {
        return ((rightNItems + leftNItems) == 0);
    }

    public boolean isEmpty() {
        return ((rightNItems + leftNItems) == maxSize);
    }

    public long peekLeft() {
        return deQueue[leftFront];
    }

    public long peekRight() {
        return deQueue[rightFront];
    }

    public int size() {
        return leftNItems + rightNItems;
    }

}
