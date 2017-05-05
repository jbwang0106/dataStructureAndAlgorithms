package com.jbwang.array;

/**
 * 比较高级的数组封装类，
 * 对外提供insert，find，和delete方法
 * 用户不需要操作数组的下标
 * Created by jbwang0106 on 2017/5/4.
 */
public class HighArray {

    /**
     * 存放数组数据
     */
    private long [] array;

    /**
     * 记录数组中元素的个数
     */
    private int nElems;

    public HighArray(int size) {
        array = new long[size];
        nElems = 0;
    }

    /**
     * 查询元素是否存在于数组中
     * @param searchKey
     * @return
     */
    public boolean find(int searchKey) {
        int j;
        for (j = 0; j < nElems; j++)
            if (array[j] == searchKey)
               break;
        if(j==nElems)
            return false;
        else
            return true;
    }

    /**
     * 往数组中插入元素
     * @param value
     */
    public void insert(long value) {
        array[nElems++] = value;
    }

    /**
     * 删除数组中的某些元素
     * @param searchKey
     * @return
     */
    public boolean delete(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (array[j] == searchKey)
                break;
        }

        if (j == nElems){
            return false;
        } else {
            for (int k = j; k < nElems; k++){
                array[k] = array[k+1];
            }

            nElems--;

            return true;
        }
    }

    /**
     * 遍历数组中的元素
     */
    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println("");
    }

    public long getMax() {
        if(nElems == 0) {
            return -1;
        } else {
            int j;
            long maxElem = array[0];
            for (j = 1; j < nElems; j++) {
                if(array[j] > maxElem) {
                    maxElem = array[j];
                }
            }

            return maxElem;
        }
    }

    public long removeMax() {
        long max = this.getMax();
        if(-1 != max) {
            this.delete(max);
            return max;
        } else {
            return -1;
        }
    }

    public int size() {
        return nElems;
    }

    public void noDup() {
        int NULL = -1; //使用-1标记重复的元素
        for (int i = 0; i < nElems; i++) {
            for (int j = i + 1; j < nElems; j++) {
                if(array[i] != NULL && array[i] == array[j]) {
                    array[j] = NULL; //标记重复的元素
                }
            }
        }

        this.display();

        for (int i = 0; i < nElems;) {
            if(array[i] == NULL) { //循环完以后先不++1，再次判断第一个元素是否为NULL
                for (int j = i + 1; j < nElems; j ++){
                    array[i] = array[j]; //元素整体向前移动，填充为NULL的元素所在的位置
                }

                nElems--; //数组元素的个数减少

            }else{
                i++; //进行下一次循环
            }
        }

    }
}

