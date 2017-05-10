package com.jbwang.link.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/10.
 */
public class QueueLinkApp {

    public static void main(String [] args) {

        QueueLink queueLink = new QueueLink();

        queueLink.insert(11);
        queueLink.insert(22);

        queueLink.display();

        queueLink.insert(33);
        queueLink.insert(44);

        queueLink.display();

        queueLink.delete();
        queueLink.delete();

        queueLink.display();

    }
}
