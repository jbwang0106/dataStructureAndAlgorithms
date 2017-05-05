package com.jbwang.array;

/**
 * 数据组相关的知识
 * Created by jbwang0106 on 2017/5/4.
 */
public class ArrayTest {

    public static void main(String [] args) {
        //创建一个数组
        long [] arr;
        arr = new long[100]; //初始化数组的大小
        int nElems = 0; //数组中以保存元素的个数
        int j; //计数器
        long searchKey; //待查找的数据
        arr[0] = 77;
        arr[1] = 88;
        arr[2] = 33;
        arr[3] = 66;
        arr[4] = 22;
        arr[5] = 99;
        arr[6] = 55;
        arr[7] = 00;
        arr[8] = 44;
        arr[9] = 11;

        nElems = 10;
        
        //遍历数组
        for (j = 0;j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");

        //查找数组中的某个元素
        searchKey = 76;
        for(j = 0; j < nElems; j++) {
            if(arr[j] == searchKey)
                break;
        }
        
        if(j == nElems)
            System.out.println("么发现要查找的元素：" + searchKey);
        else 
            System.out.println("发现查找的元素：" + searchKey);

        //删除某个元素
        searchKey = 55;
        for(j = 0; j < nElems; j++)
            if(arr[j] == searchKey)
                break;

        for (int k = j; k < nElems; k++)
            arr[k] = arr[k+1];

        nElems--;

        //遍历数组
        for (j = 0;j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }

        System.out.println("");
    }

}
