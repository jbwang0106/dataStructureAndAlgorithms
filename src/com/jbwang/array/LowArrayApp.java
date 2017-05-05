package com.jbwang.array;

/**
 * 测试lowArray类
 * Created by jbwang0106 on 2017/5/4.
 */
public class LowArrayApp {

    public static void main(String [] args) {

        LowArray array = new LowArray(100);
        int nElems = 0;
        int j;
        long searchKey;
        array.setElem(0,88);
        array.setElem(1,11);
        array.setElem(2,55);
        array.setElem(3,00);
        array.setElem(4,44);
        array.setElem(5,77);
        array.setElem(6,77);
        array.setElem(7,99);
        array.setElem(8,22);
        array.setElem(9,33);

        nElems = 10;
        //遍历数组
        for (j = 0;j < nElems; j++) {
            System.out.print(array.getElem(j) + " ");
        }
        System.out.println("");

        //查找数组中的某个元素
        searchKey = 76;
        for(j = 0; j < nElems; j++) {
            if(array.getElem(j) == searchKey)
                break;
        }

        if(j == nElems)
            System.out.println("么发现要查找的元素：" + searchKey);
        else
            System.out.println("发现查找的元素：" + searchKey);

        //删除某个元素
        searchKey = 55;
        for(j = 0; j < nElems; j++)
            if(array.getElem(j) == searchKey)
                break;

        for (int k = j; k < nElems; k++)
            array.setElem(k,array.getElem(k+1));

        nElems--;

        //遍历数组
        for (j = 0;j < nElems; j++) {
            System.out.print(array.getElem(j) + " ");
        }

        System.out.println("");
    }
}
