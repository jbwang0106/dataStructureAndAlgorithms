package com.jbwang.link.doublelink;

/**
 * 双向链表的基础类
 * Created by jbwang0106 on 2017/5/11.
 */
public class Link {

    /**
     * 链表保存的数据
     */
    public int iData;

    /**
     * 链表的下一个节点
     */
    public Link next;

    /**
     * 链表的上一个节点
     */
    public Link previous;

    public Link (int iData) {
        this.iData = iData;
    }
    
    public void disLink() {
        System.out.print(iData + " ");
    }

}
