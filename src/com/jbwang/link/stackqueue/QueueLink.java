package com.jbwang.link.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/10.
 */
public class QueueLink {

    public FirstLastLink firstLastLink;

    public QueueLink() {
        firstLastLink = new FirstLastLink();
    }

    public boolean isEmpty() {
        return firstLastLink.isEmpty();
    }

    public void insert(int data) {
        firstLastLink.insertLast(data);
    }

    public int delete() {
        return firstLastLink.deleteFirst();
    }

    public void display() {
        firstLastLink.display();
    }
}
