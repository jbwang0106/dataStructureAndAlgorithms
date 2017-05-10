package com.jbwang.link;

/**
 * 双端链表的实现
 * Created by jbwang0106 on 2017/5/10.
 */
public class FirstLastLink {

    /**
     * 链表的头部
     */
    public Link first;

    /**
     * 链表的尾部
     */
    public Link last;

    public FirstLastLink() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    /**
     * 从头部插入元素
     * @param iData
     * @param dData
     */
    public void insertFirst(int iData, double dData) {
        Link link = new Link(iData, dData);
        if (isEmpty())
            last = link;

        link.next = first;
        first = link;
    }

    public void insertLast(int iData, double dData) {
        Link link = new Link(iData, dData);

        if (isEmpty()) {
            first = link;
        } else {
            last.next = link;
        }
        last = link;

    }

    public Link deleteFirst() {
        Link temp = first;

        if (first.next == null)
            last = null;
        first = first.next;

        return temp;
    }

    public void display() {

        System.out.println("First------>Last");
        Link current = first;

        while (current != null) {
            current.display();
            current = current.next;
        }
        
        System.out.println("");
    }

}
