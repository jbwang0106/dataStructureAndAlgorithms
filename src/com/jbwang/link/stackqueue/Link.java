package com.jbwang.link.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/10.
 */
public class Link {

    public int data;

    public Link next;

    public Link(int data) {
        this.data = data;
    }

    public void display() {
        System.out.print("{" + data + "} ");
    }
}
