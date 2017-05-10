package com.jbwang.link.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/10.
 */
public class LinkList {

    public Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Link link = new Link(data);

        link.next = first;
        first = link;
    }

    public int deleteFirst() {

        Link temp = first;
        first = first.next;

        return temp.data;
    }

    /**
     * 显示链表内的所有信息
     */
    public void displayList() {
        System.out.println("(First------->Last)");
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println();
    }
}
