package com.jbwang.link;

/**
 * 链表的节点对象
 * Created by jbwang0106 on 2017/5/10.
 */
public class Link {

    /**
     * 存放的int型数据
     */
    public int iData;
    
    /**
     * 存放double型数据
     */
    public double dData;

    /**
     * 指向下一个节点
     */
    public Link next;
    
    public Link(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
        next = null;
    }
    
    public void display() {
        System.out.print("{"+ iData + ", "+ dData +"}");
    }
}
