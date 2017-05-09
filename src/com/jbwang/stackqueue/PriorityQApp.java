package com.jbwang.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/9.
 */
public class PriorityQApp {

    public static void main(String[] args) {
        PriorityQueue01 thePQ = new PriorityQueue01(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);
        thePQ.display();
        thePQ.display1();
        while (!thePQ.isEmpty()) {
            long item = thePQ.remove();
            System.out.print(item + " "); // 10, 20, 30, 40, 50
        } // end while
        System.out.println("");
    }

}
