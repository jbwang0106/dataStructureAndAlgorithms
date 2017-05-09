package com.jbwang.stackqueue;

/**
 * 4.4
 * 使用数组实现优先队列
 *  插入的时间复杂度为O(1),删除的时间复杂度为O(N)
 * Created by jbwang0106 on 2017/5/8.
 */
public class PriorityQueue01 {

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

    public PriorityQueue01(int maxSize) {
        this.maxSize = maxSize;
        queue = new long [maxSize];
        nItems = 0;
    }

    public void insert(long value) {
        queue[nItems++] = value;
    }

    public long remove() {
        int min = 0;
        for (int i = 1; i < nItems; i++) {
            if(queue[i] < queue[min])
                min = i;
        }

        long temp = queue[min];
        for (int j = min; j < nItems-1; j++) {
            queue[j] = queue[j+1];
        }

        nItems--;
        return temp;
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

    // 编程作业 4.4 //题目有 歧义
    // 方法一 ：如果按插入的顺序显示
    public void display() {
        System.out.print("队列为：");
        for (int i = 0; i < nItems; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // 编程作业 4.4 //题目有 歧义
    // 方法二 ：如果按优先级显示
    public void display1() {

        //创建临时数组
        long [] temps = new long[nItems];
        System.arraycopy(queue,0,temps,0,nItems);

        //1. 使用冒泡排序
        /*for (int i = 0; i < nItems-1; i++) {
            for (int j = 0; j < nItems-1-i; j++) {
                if(temps[j] > temps[j+1]){
                    long temp = temps[j];
                    temps[j] = temps[j+1];
                    temps[j+1] = temp;
                }
            }
        }*/

        //2. 使用选择排序实现
        /*long temp;
        int min = 0;
        for (int i = 0; i < nItems-1; i++) {
            min = i;
            for (int j = i+1; j < nItems; j++) {
                if(temps[min] > temps[j]){
                    min = j;
                }
            }

            temp = temps[i];
            temps[i] = temps[min];
            temps[min] = temp;

        }*/

        //3. 使用插入排序实现
        for (int i = 1; i < nItems; i++) {
            long temp = temps[i];
            int j = i;
            while (j > 0 && temps[j-1] > temp) {
                temps[j] = temps[j-1];
                j--;
            }

            temps[j] = temp;
        }

        System.out.print("队列为：");
        for (int i = 0; i < nItems; i++) {
            System.out.print(temps[i] + " ");
        }
        System.out.println();
    }

}
