package com.jbwang.link.interiterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jbwang0106 on 2017/5/12.
 */
public class LinkListApp {

    public static void main(String [] args) throws IOException {

        LinkList linkList = new LinkList();

        LinkList.ListIterator listIterator = linkList.getListIterator();

        listIterator.insertAfter(20);
        listIterator.insertAfter(40);
        listIterator.insertAfter(80);
        listIterator.insertBefore(60);

        int value;

        while (true) {
            char choice = getChar();

            switch (choice) {
                case 's':
                    if (linkList.isEmpty())
                        System.out.println("empty ");
                    else
                        linkList.displayList();
                    break;
                case 'r':
                    listIterator.reset();
                    break;
                case 'n':
                    if (!linkList.isEmpty() && !listIterator.atEnd())
                        listIterator.nextLink();
                    else 
                        System.out.println("不能到达下一个！");
                    break;
                case 'g':
                    if (!linkList.isEmpty()) {
                        value = listIterator.getCurrent().data;
                        System.out.println("value: " + value);
                    } else 
                        System.out.println("empty");
                    break;
                case 'b':
                    System.out.println("请输入");
                    System.out.flush();
                    value = getInt();
                    listIterator.insertBefore(value);
                    break;
                case 'a':
                    System.out.println("请输入");
                    System.out.flush();
                    value = getInt();
                    listIterator.insertAfter(value);
                    break;
                case 'd':
                    if (!linkList.isEmpty()) {
                        value = listIterator.deleteCurrent();
                        System.out.println("被删除的元素" + value);
                    } else
                        System.out.println("不能删除元素");
                    break;
                default:
                    break;
            }

        }



    }

    public static String getString() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String s = bufferedReader.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String string = getString();

        return string.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

}
