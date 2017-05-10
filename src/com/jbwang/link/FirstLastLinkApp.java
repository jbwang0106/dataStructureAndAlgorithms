package com.jbwang.link;

import java.awt.*;

/**
 * Created by jbwang0106 on 2017/5/10.
 */
public class FirstLastLinkApp {

    public static void main(String [] args) {

        FirstLastLink firstLastLink = new FirstLastLink();

        firstLastLink.insertFirst(22,22.2);
        firstLastLink.insertFirst(44,44.4);
        firstLastLink.insertFirst(66,66.6);

        firstLastLink.insertLast(11,11.1);
        firstLastLink.insertLast(33,33.3);
        firstLastLink.insertLast(55,55.5);

        firstLastLink.display();

        firstLastLink.deleteFirst();
        firstLastLink.deleteFirst();

        firstLastLink.display();


    }


}
