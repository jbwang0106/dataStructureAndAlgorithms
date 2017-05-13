package com.jbwang.link.chap05;

import com.jbwang.link.doublelink.DouleLinkList;
import com.jbwang.link.doublelink.Link;

/**
 * 双向链表的双端队列
 * Created by jbwang0106 on 2017/5/12.
 */
public class DeQueue {

    public DouleLinkList doubleLink;

    public DeQueue() {
        doubleLink = new DouleLinkList();
    }

    public void insertLeft(int data) {
        doubleLink.insertFirst(data);
    }

    public void insertRight(int data) {
        doubleLink.insertLast(data);
    }

    public int deleteLeft() {
        Link link = doubleLink.deleteFirst();
        return link.iData;
    }

    public int deleteRight() {
        Link link = doubleLink.deleteLast();
        return link.iData;

    }

    public void dispaly() {
        doubleLink.displayBackward();
        System.out.println();
        doubleLink.displayForward();
    }

}
