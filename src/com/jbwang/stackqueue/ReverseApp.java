package com.jbwang.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/8.
 */
public class ReverseApp {

    public static void main(String [] args) {
        ReverseWord reverseWord = new ReverseWord("helloworld");
        String s = reverseWord.doRev();
        System.out.println("输入的单词：" + "helloworld");
        System.out.println("反转后的单词：" + s);
    }
}
