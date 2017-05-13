package com.jbwang.link.chap05;

/**
 * Created by jbwang0106 on 2017/5/12.
 */
public class PriorityQueueApp {
    
    public static void main(String [] args) {

        PriorityQueue queue = new PriorityQueue();
        queue.insert(33);
        queue.insert(77);
        queue.insert(55);
        queue.insert(11);
        queue.insert(99);

        queue.display();

        int delete = queue.delete();
        System.out.println("delete: " + delete);

        queue.display();
    }
    
}
