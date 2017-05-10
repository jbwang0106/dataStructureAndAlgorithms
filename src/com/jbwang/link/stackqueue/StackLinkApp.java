package com.jbwang.link.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/10.
 */
public class StackLinkApp {

    public static void main(String [] args) {

        StackLink stackLink = new StackLink();

        stackLink.push(11);
        stackLink.push(22);
        stackLink.push(33);
        stackLink.push(44);

        stackLink.display();

        stackLink.push(55);
        stackLink.push(66);

        stackLink.display();

        stackLink.pop();
        stackLink.pop();

        stackLink.display();

    }

}
