package com.jbwang.link;

/**
 * Created by jbwang0106 on 2017/5/10.
 */
public class LinkListApp2 {

    public static void main(String [] args) {

        LinkList linkList = new LinkList();

        linkList.insertLink(22,22.2);
        linkList.insertLink(44,44.4);
        linkList.insertLink(66,66.6);
        linkList.insertLink(88,88.8);
        linkList.insertLink(90,90.9);

        linkList.displayList();

        Link byKey = linkList.findByKey(44);

        if (byKey != null)
            System.out.println("find link with key" + byKey.iData);
        else
            System.out.println("can not find link");


        Link deleteByKey = linkList.deleteByKey(66);
        
        if (deleteByKey != null)
            System.out.println("delete link with key " + deleteByKey.iData);
        else 
            System.out.println("can not delete link");


        linkList.displayList();

    }
}
