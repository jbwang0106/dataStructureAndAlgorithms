package com.jbwang.link.chap05;

import com.jbwang.link.stackqueue.Link;
import com.jbwang.link.stackqueue.SortLink;

/**
 * 优先队列的实现
 * Created by jbwang0106 on 2017/5/12.
 */
public class PriorityQueue {

    public SortLink link;

    public PriorityQueue() {
        link = new SortLink();
    }

    public void insert(int data) {
        link.insertSort(data);
    }

    public int delete() {
        return link.delete().data;
    }

    public void display() {
        link.display();
    }
}
