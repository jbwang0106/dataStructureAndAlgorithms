package com.jbwang.link.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/10.
 */
public class SortLinkApp {

    public static void main(String [] args) {

        SortLink sortLink = new SortLink();

        sortLink.insertSort(20);
        sortLink.insertSort(40);

        sortLink.display();

        sortLink.insertSort(10);
        sortLink.insertSort(50);
        sortLink.insertSort(30);

        sortLink.display();

        sortLink.delete();

        sortLink.display();
    }

}
