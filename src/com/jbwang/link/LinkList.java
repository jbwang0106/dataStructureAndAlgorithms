package com.jbwang.link;

/**
 * 自定义实现的链表
 * Created by jbwang0106 on 2017/5/10.
 */
public class LinkList {

    /**
     * 指向链表的第一个元素
     */
    public Link first;

    public LinkList() {
        first = null;
    }

    /**
     * 判断链表是否为空
     * @return
     */
    public boolean isEmpty() {
        return (first == null);
    }

    /**
     * 向链表的头部插入
     * @param iData
     * @param dDada
     */
    public void insertLink(int iData, double dDada){
        Link link = new Link(iData,dDada);
        link.next = first;
        first = link;
    }

    /**
     * 删除链表头部的元素
     * @return
     */
    public Link deleteLink() {
        Link temp = first;
        first = first.next;
        return temp;
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

    /**
     * 查找指定节点的元素
     */
    public Link findByKey(int key) {
        Link current = first;
        while (current.iData != key) {
            if (current.next == null)
                return null;
            else
                current = current.next;
        }

        return current;
    }

    /**
     * 删除指定节点的元素
     * @param key
     * @return
     */
    public Link deleteByKey(int key) {
        Link current = first; //要删除的节点
        Link previous = first;//要删除节点的前一个节点

        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }

        if (current == first) {
            first = first.next;
        } else {
            //让current的前一个节点的next指向current的next,current就不在链表中了
            previous.next = current.next;
        }

        return current;

    }

}
