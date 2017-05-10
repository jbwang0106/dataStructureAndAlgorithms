package com.jbwang.link.stackqueue;

import javax.swing.*;

/**
 * Created by jbwang0106 on 2017/5/10.
 */
public class SortLink {

    public Link first;

    public SortLink() {

        first = null;

    }

    public SortLink(Link[] linkArr) {
        first = null;

        for (int i = 0; i < linkArr.length; i++) {
            insert(linkArr[i]);
        }

    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(Link link) {
        Link previous = null;
        Link current = first;

        while (current != null && link.data > current.data) {
            previous = current;
            current = current.next;
        }

        if (previous == null)
            first = link;
        else
            previous.next = link;

        link.next = current;

    }

    public void insertSort(int data) {
        Link link = new Link(data);
        Link previous = null;
        Link current = first;

        while (current != null && data > current.data) {
            previous = current;
            current = current.next;
        }

        if (previous == null)
            first = link;
        else
            previous.next = link;

        link.next = current;

    }

    public Link delete() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void display() {
        Link current = first;

        while (current != null) {
            current.display();
            current = current.next;
        }

        System.out.println("");

    }
}
