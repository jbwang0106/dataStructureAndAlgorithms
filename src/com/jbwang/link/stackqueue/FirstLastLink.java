package com.jbwang.link.stackqueue;

import java.awt.*;

/**
 * Created by jbwang0106 on 2017/5/10.
 */
public class FirstLastLink {
    
    public Link first;
    public Link last;
    
    public FirstLastLink() {
        first = null;
        last = null;
    }
    
    public boolean isEmpty() {
        return (first == null);
    }
    
    public void insertFirst(int data) {
        
        Link link = new Link(data);
        
        if (isEmpty())
            last = link;
        
        link.next = first;
        first = link;
        
    }
    
    public void insertLast(int data) {
        
        Link link = new Link(data);
        
        if (isEmpty()) {
            first = link;
        } else {
            last.next = link;
        }
        
        last = link;
        
    }
    
    public int deleteFirst() {
        Link temp = first;
        
        if (first.next == null)
            last = null;
        
        first = first.next;
        
        return temp.data;
        
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
