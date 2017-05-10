package com.jbwang.link.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/10.
 */
public class StackLink {

    public LinkList linkList;

    public StackLink() {
        linkList = new LinkList();
    }

    public boolean isEmpty() {
        return linkList.isEmpty();
    }

    public void push(int data) {
        linkList.insertFirst(data);
    }

    public int pop() {
        return linkList.deleteFirst();
    }

    public void display() {
        linkList.displayList();
    }

}
