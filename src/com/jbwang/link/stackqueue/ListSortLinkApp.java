package com.jbwang.link.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/10.
 */
public class ListSortLinkApp {

    public static void main(String [] args) {

        Link[] linkArr = new Link[10];

        for (int i = 0; i < 10; i++) {
            int data = (int)(Math.random()*99);
            linkArr[i] = new Link(data);
        }

        System.out.println("未排序前：");
        displayList(linkArr);


        SortLink sortLink = new SortLink(linkArr);
        
        System.out.println("加入有序链表后：");
        sortLink.display();

        for (int i = 0; i < 10; i++) {
            linkArr[i] = sortLink.delete();
        }
        
        System.out.println("排序后：");
        displayList(linkArr);

    }
    
    public static void displayList(Link [] linkArr) {
        for (int i = 0; i < linkArr.length; i++) {
            
            System.out.print(linkArr[i].data + " ");
            
        }
        System.out.println("");
    } 

}
