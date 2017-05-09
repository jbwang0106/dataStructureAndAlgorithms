package com.jbwang.stackqueue;

/** 4.3
 *  双端栈的数组实现
 * Created by jbwang0106 on 2017/5/9.
 */
public class DeStack {

    private int maxSize;

    private int leftTop;

    private int rightTop;

    private long[] deStack;

    public DeStack(int maxSize) {
        this.maxSize = maxSize;
        this.deStack = new long[maxSize];
        this.leftTop = -1;
        this.rightTop = -1;
    }

    public void leftPush(long value) {
        deStack[++leftTop] = value;
    }

    public void rightPush(long value) {
        deStack[rightTop] = value;
    }

    public long leftPop() {
        return deStack[leftTop--];
    }

    public long rightPop() {
        return deStack[rightTop];
    }

    public boolean isEmpty() {
        return (leftTop == -1 && rightTop == -1);
    }

    public boolean isFull() {
        return (leftTop+rightTop) == (maxSize-1);
    }

}
