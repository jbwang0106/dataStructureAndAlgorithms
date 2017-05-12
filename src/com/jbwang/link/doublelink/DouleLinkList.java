package com.jbwang.link.doublelink;

/**
 * 实现双向链表
 * Created by jbwang0106 on 2017/5/11.
 */
public class DouleLinkList {

    /**
     * 保存第一个节点元素
     */
    public Link first;

    /**
     * 保存最后一个节点元素
     */
    public Link last;

    public DouleLinkList() {
        first = null;
        last = null;
    }

    /**
     * 链表是否为空
     * @return
     */
    public boolean isEmpty() {
        return (first == null);
    }

    /**
     * 从头部插入元素
     * @param data
     */
    public void insertFirst(int data) {
        Link newLink = new Link(data);

        if (isEmpty())
            last = newLink;
        else
            first.previous = newLink;

        newLink.next = first;
        first = newLink;
    }

    /**
     * 从尾部插入元素
     * @param data
     */
    public void insertLast(int data) {
        Link newLink = new Link(data);

        if (isEmpty())
            first = newLink;
        else
            last.next = newLink;

        newLink.previous = last;
        last = newLink;
    }

    /**
     * 在指定的元素后面插入元素
     * @param key 指定的元素
     * @param data 待插入的元素
     */
    public boolean insertAfter(int key, int data) {
        Link newLink = new Link(data);
        Link current = first; //指定的节点

        if (!isEmpty()) {
            while (current.iData != key) {
                current = current.next;
                if (current == null)
                    return false;
            }

            if (current == last) {
                newLink.next = null;
                last = newLink;
            } else {
                current.next.previous = newLink;
                newLink.next = current.next;
            }

            current.next = newLink;
            newLink.previous = current;

            return true;
        }

        return false;
    }

    /**
     * 删除第一个节点
     * @return
     */
    public Link deleteFirst() {
        Link temp = first;

        if (first.next == null)
            last = null;
        else
            first.next.previous = null;

        first = first.next;
        return temp;
    }

    /**
     * 删除最后一个节点
     * @return
     */
    public Link deleteLast() {
        Link temp = last;

        if (last.previous == null)
            first = null;
        else
            last.previous.next = null;

        last = last.previous;
        return temp;
    }

    /**
     * 删除指定元素的节点
     * @param key
     * @return
     */
    public Link deleteKey(int key) {

        Link current = first;

        while (current.iData != key) {
            current = current.next;
            if (current == null)
                return null;
        }

        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }

        if (current == last)
            last = current.previous;
        else
            current.next.previous = current.previous;

        return current;
    }

    public void displayForward () {
        System.out.println("First-------->Last");
        Link current = first;
        while (current != null) {
            current.disLink();
            current = current.next;
        }

        System.out.println();
    }

    public void displayBackward() {
        System.out.println("Last---->First");
        Link current = last;
        while (current != null) {
            current.disLink();
            current = current.previous;
        }
        System.out.println();
    }
}
