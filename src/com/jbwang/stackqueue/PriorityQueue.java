package com.jbwang.stackqueue;

/** 使用数组实现优先队列
 *  插入的时间复杂度为O(N),删除的时间复杂度为O(1)
 * Created by jbwang0106 on 2017/5/8.
 */
public class PriorityQueue {

    /**
     * 队列的大小
     */
    private int maxSize;

    /**
     * 实现优先队列的数组
     */
    private long [] queue;

    /**
     * 队列中元素的个数
     */
    private int nItems;

    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new long [maxSize];
        nItems = 0;
    }

    public void insert(long value) {
        if (nItems == 0) {
            queue[nItems++] = value;
        } else {
            int i;
            for (i = nItems-1; i >= 0; i--) {
                if (queue[i] < value) {
                    queue[i+1] = queue[i];
                } else {
                    break;
                }
            }

            queue[i+1] = value; //此时这个位置就是那个空出来的位置
            nItems++;
        }

    }

    public long remove() {
        return queue[--nItems];
    }

    public long peekMin() {
        return queue[nItems-1];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}
