package com.jbwang.link.doublelink;

/**
 * Created by jbwang0106 on 2017/5/11.
 */
public class DoubleLinkListApp {

    public static void main(String [] args) {

        DouleLinkList douleLinkList = new DouleLinkList();

        douleLinkList.insertFirst(22);
        douleLinkList.insertFirst(44);
        douleLinkList.insertFirst(66);

        douleLinkList.insertLast(11);
        douleLinkList.insertLast(33);
        douleLinkList.insertLast(55);

        douleLinkList.displayForward();
        douleLinkList.displayBackward();

        douleLinkList.deleteFirst();
        douleLinkList.deleteLast();
        douleLinkList.deleteKey(11);

        douleLinkList.displayForward();
        douleLinkList.displayBackward();

        douleLinkList.insertAfter(22,77);
        douleLinkList.insertAfter(33,88);

        douleLinkList.displayForward();
        douleLinkList.displayBackward();

    }

}
