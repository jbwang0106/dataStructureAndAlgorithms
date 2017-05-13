package com.jbwang.link.chap05;

/**
 * Created by jbwang0106 on 2017/5/12.
 */
public class DeQueueApp {

    public static void main(String [] args) {

        DeQueue deQueue = new DeQueue();

        deQueue.insertLeft(11);
        deQueue.insertLeft(22);
        deQueue.insertLeft(33);

        deQueue.dispaly();

        deQueue.deleteRight();

        deQueue.dispaly();
    }

}
