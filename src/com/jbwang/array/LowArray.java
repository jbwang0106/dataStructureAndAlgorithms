package com.jbwang.array;

/**
 * 比较简单的数组封装类，
 * 用户还需要对数组的下标进行操作
 * Created by jbwang0106 on 2017/5/4.
 */
public class LowArray {

    private long[] arr;

    public LowArray(int asize) {
        arr = new long[asize];
    }

    public void setElem(int index, long value) {
        arr[index] = value;
    }

    public long getElem(int index) {
        return arr[index];
    }
}
