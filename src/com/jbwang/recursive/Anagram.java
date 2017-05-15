package com.jbwang.recursive;

/**
 * Created by jbwang0106 on 2017/5/13.
 */
public class Anagram {

    public static int size;   //记录单词的长度
    public static int count;  //进行变位字的计数
    public static char[] charArr = new char[100];  //单词存放的数组
    
    public static void main(String [] args) {
        String temp = "cat";  //进行变位的单词
        size = temp.length();
        count = 0;
        for (int i = 0; i < size; i++) {
            charArr[i] = temp.charAt(i);
        }

        doAnagram(size);
    }

    public static void doAnagram(int newSize) {
        if (newSize == 1) {
            return;
        }

        for (int i = 0; i < newSize; i++) {
            doAnagram(newSize-1);
            if (newSize == 2)
                displayWord();
            rotate(newSize);
        }
    }

    private static void rotate(int newSize) {
        int j;
        int position = size - newSize;
        char temp = charArr[position];
        for (j = position+1; j < size; j++)
            charArr[j-1] = charArr[j];
        charArr[j-1] = temp;
    }

    /**
     * 打印结果
     */
    private static void displayWord() {
        System.out.print(++count + " ");
        for (int i = 0; i < size; i++)
            System.out.print(charArr[i]);

        System.out.print("  ");
        System.out.flush();
        
        if (count%6 == 0)
            System.out.println("  ");
    }


}
