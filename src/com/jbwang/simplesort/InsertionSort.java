package com.jbwang.simplesort;

/** 插入排序
 *  适用于部分有序的数组
 *  时间复杂度为O(N^2)
 * Created by jbwang0106 on 2017/5/7.
 */
public class InsertionSort {

    public static int [] array = {23,87,45,95,34,57,61};

    public static void main(String [] args) {

        System.out.println("排序前：");
        display();

        sort();

        System.out.println("排序后: ");
        display();

        int medain = medain();
        System.out.println("中间数值为：" + medain);
        
    }

    public static void display() {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println();
    }

    /**
     * 排序
     */
    public static void sort() {
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i;
            while (j > 0 && array[j-1] >= temp) {
                array[j] = array[j-1]; //把前一项的值往后移，空出前一项的位置
                j--;
            }

            array[j] = temp; //在空的位置插入这个值
        }
    }

    public static int medain() {
        sort();
        int length = array.length;
        int mid = 0;
        if(length%2 == 0)
            mid = length/2-1;
        else
            mid = (length+1)/2-1;
        return array[mid];
    }

    public static void noDups() {

    }

}
