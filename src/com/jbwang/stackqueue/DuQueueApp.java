package com.jbwang.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/9.
 */
public class DuQueueApp {

    public static void main(String[] args) {
        DuQueue theQueue = new DuQueue(5); // queue holds 5 items
        System.out.println("队例是否为空：" + theQueue.isEmpty());
        System.out.println("队例是否为满：" + theQueue.isFull());
        System.out.println("队列的大小为：" + theQueue.size());
        theQueue.display();
        
        theQueue.insertLeft(10);
        long l = theQueue.removeRight();
        System.out.println(l);
//        theQueue.insertRight(10); // insert 4 items
//        theQueue.insertRight(20);
//        theQueue.insertRight(30);
//        theQueue.insertRight(40);
//        System.out.println("队列的大小为：" + theQueue.size());
//        theQueue.display();
//
//
//
//        theQueue.removeLeft(); // remove 3 items
//        theQueue.removeLeft(); // (10, 20, 30)
//        theQueue.removeLeft();
//        System.out.println("队列的大小为：" + theQueue.size());
//        theQueue.display();
//
//        theQueue.insertLeft(50); // insert 4 more items
//        theQueue.insertLeft(60); // (wraps around)
//        theQueue.insertLeft(70);
//        theQueue.insertLeft(80);
//        System.out.println("队例是否为空：" + theQueue.isEmpty());
//        System.out.println("队例是否为满：" + theQueue.isFull());
//        System.out.println("队列的大小为：" + theQueue.size());
//        theQueue.display();
//
//        theQueue.removeRight(); // remove 3 items
//        theQueue.removeRight(); // (10, 20, 30)
//        theQueue.removeRight();
//        System.out.println("队列的大小为：" + theQueue.size());
//        theQueue.display();

    }
}
