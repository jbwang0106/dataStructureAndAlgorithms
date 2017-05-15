package com.jbwang.recursive;

import java.util.SimpleTimeZone;

/**
 * Created by jbwang0106 on 2017/5/13.
 */
public class MergeSortApp {

    public static void main(String [] args) {

        incomeMerge();

    }

    public static void incomeMerge() {
        int [] arrA = {23, 47, 81, 95};
        int [] arrB = {7, 14, 39, 55, 62, 74};

        int [] arrC = new int[10];

        merge(arrA, 4, arrB, 6, arrC);
        display(arrC, 10);
    }

    public static void merge(int [] arrA, int asize, int [] arrB, int bsize, int [] arrC) {

        int aDex = 0, bDex = 0, cDex = 0;

        while (aDex < asize && bDex < bsize) {
            if (arrA[aDex] > arrB[bDex])
                arrC[cDex++] = arrB[bDex++];
            else
                arrC[cDex++] = arrA[aDex++];
        }

        while (aDex < asize) {
            arrC[cDex++] = arrA[aDex++];
        }

        while (bDex < bsize)
            arrC[cDex++] = arrB[bDex++];

    }

    public static void display(int [] theArray, int size) {
        for (int j = 0; j < size; j++)
            System.out.print(theArray[j] + " ");
        
        System.out.println("");
    }
}
