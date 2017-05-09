package com.jbwang.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/8.
 */
public class PriorityQueueApp {

    public static void main(String [] args) {

        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.insert(30);
        priorityQueue.insert(10);
        priorityQueue.insert(50);
        priorityQueue.insert(20);
        priorityQueue.insert(40);
        
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.remove() + " ");
        }
        
        System.out.println();
    }

}
