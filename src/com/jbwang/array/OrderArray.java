package com.jbwang.array;

import java.util.Arrays;

/** 有序数组的封装类
 *  关键字的查找使用二分查找法
 * Created by jbwang0106 on 2017/5/4.
 */
public class OrderArray {

    /**
     * 封装数组元素
     */
    private long[] array;

    /**
     * 记录数组中元素的个数
     */
    private int nElems;

    public OrderArray(int size) {
        array = new long[size];
        nElems = 0;
    }

    /**
     * 返回数组中存在元素的个数
     * @return
     */
    public int size() {
        return nElems;
    }

    /**
     * 返回元素在数组中的位置
     * 使用二分查找法进行查找
     * @return
     */
    public int find(long searchKey) {

        int lowerBound = 0; //开始查找的位置
        int upperBound = nElems - 1; //结束查找的位置
        int curIn; //元素所在的位置

        while (true) {
            //找出中间的索引
            curIn = (lowerBound + upperBound) / 2;
            if(array[curIn] == searchKey) { //如果等于要查找的元素就直接返回该元素所在的索引
                return curIn;
            } else if(lowerBound > upperBound) {  //开始的索引大于结束的索引则返回数组的长度，即没有找到元素
                return nElems; 
            } else {
                if(array[curIn] < searchKey) {  //减半操作
                    lowerBound = curIn + 1; 
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    /**
     * 向有序数组中插入元素，同时返回元素所在的位置
     * @param value
     * @return
     */
    public int insert(long value) {
        int j;
        for (j = 0; j < nElems; j++){
            if (array[j] > value)
                break;
        }

        for (int k = nElems; k > j; k--) {
            array[k] = array[k-1];
        }

        array[j] = value;
        nElems++;

        return j;
    }

    /**
     * 删除有序数组中的元素
     * @param value
     * @return
     */
    public boolean delete(long value) {
        int j = this.find(value);

        if (j == nElems) {
            return false;
        } else {

            for (int k = j; k < nElems; k++) {
                array[k] = array[k+1];
            }

            nElems--;
            return true;
        }
    }
    
    public void display() {
        for (int j = 0; j < nElems; j++){
            System.out.print(array[j] + " ");
        }
        
        System.out.println("");
    }

    public OrderArray merge(long [] a) {
        OrderArray arr = new OrderArray(this.nElems + a.length);
        for (int i = 0;i < nElems; i++)
            arr.insert(array[i]);

        for (int j = 0;j < a.length; j++)
            arr.insert(a[j]);

        return arr;
    }

    public static long[] merge01(long[] a, long[] b) {
        long [] arr = new long[a.length + b.length];
        int j;
        for (j = 0; j < a.length; j++) {
            arr[j] = a[j];
        }
        
        for (int k = j; k < arr.length; k++) {
            arr[k] = b[k-j];
        }

        Arrays.sort(arr);
        
        return arr;
    }
    
    public static void main(String [] args) {
        long [] a = {7,2,5,9,4,0,8,3};
        long [] b = {1,6,10,15,11,14,12,13};
        long[] merge = OrderArray.merge01(a, b);
        
        for (int i = 0; i< merge.length; i++) {
            System.out.println(merge[i]);
        }
    }
} 
