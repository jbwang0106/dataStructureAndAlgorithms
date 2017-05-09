package com.jbwang.stackqueue;

/**
 * 使用数组的方式实现简单的stack数据结构
 * 时间复杂度为O(1)
 * Created by jbwang0106 on 2017/5/8.
 */
public class StackX {

    /**
     * stack的大小
     */
    private int maxSize;

    /**
     * stack的底层实现-数组
     */
    private long [] stackArray;

    /**
     * stack的位置
     */
    private int top;

    public StackX(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new long[maxSize];
        top = -1;
    }

    /**
     * 进栈
     * @param value
     * @return
     */
    public long push(long value) {
        return stackArray[++top] = value;
    }

    /**
     * 出栈
     * @return
     */
    public long pop() {
        return stackArray[top--];
    }

    /**
     * 查看栈顶元素
     * @return
     */
    public long peek() {
        return stackArray[top];
    }

    /**
     * 是否为空栈
     * @return
     */
    public boolean isEmpty() {
        return (top == -1);
    }

    /**
     * 栈是否已满
     * @return
     */
    public boolean isFull() {
        return (top == (maxSize-1));
    }
}
