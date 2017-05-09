package com.jbwang.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/8.
 */
public class QueueApp {

    public static void main(String [] args) {

        Queue queue = new Queue(5);

        queue.insert(11);
        queue.insert(22);
        queue.insert(33);
        queue.insert(44);

        long[] longs = queue.displayQueue();
        for (int i = 0; i < longs.length; i++) {
            System.out.print(longs[i] + " ");
        }

        System.out.println();
        queue.displayQueue01();

        queue.remove();
        queue.remove();
        queue.remove();

        longs = queue.displayQueue();
        for (int i = 0; i < longs.length; i++) {
            System.out.print(longs[i] + " ");
        }

        System.out.println();

        queue.displayQueue01();

        queue.insert(55);
        queue.insert(66);
        queue.insert(77);
        queue.insert(88);

        longs = queue.displayQueue();
        for (int i = 0; i < longs.length; i++) {
            System.out.print(longs[i] + " ");
        }

        System.out.println();

        queue.displayQueue01();
        
        while (!queue.isEmpty()) {
            long remove = queue.remove();
            System.out.print(remove + " ");
        }
        
        System.out.println();

    }
}
