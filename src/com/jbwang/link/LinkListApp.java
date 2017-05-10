package com.jbwang.link;

/**
 * Created by jbwang0106 on 2017/5/10.
 */
public class LinkListApp {

    public static void main(String [] args) {

        LinkList linkList = new LinkList();

        linkList.insertLink(22,22.2);
        linkList.insertLink(44,44.4);
        linkList.insertLink(66,66.6);
        linkList.insertLink(88,88.8);
        linkList.insertLink(90,90.9);

        linkList.displayList();

        while (!linkList.isEmpty()) {
            Link link = linkList.deleteLink();
            link.display();
        }
        System.out.println("");

        linkList.displayList();

    }
}
