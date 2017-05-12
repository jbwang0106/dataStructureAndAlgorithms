package com.jbwang.link.interiterator;

/** 实现迭代器的链表
 * Created by jbwang0106 on 2017/5/11.
 */
public class LinkList {

    private Link first;

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public LinkList() {}

    public boolean isEmpty() {
        return (first == null);
    }

    public void displayList() {
        
        Link current = first;
        
        while (current != null) {
            current.display();
            current = current.next;
        }
        
        System.out.println("");
    }

    public ListIterator getListIterator() {
        return new ListIterator(this);
    }

    class ListIterator {

        private Link current;
        private Link previous;
        private LinkList linkList;

        public ListIterator(LinkList linkList) {
            this.linkList = linkList;
            reset();
        }

        public void reset() {
            current = linkList.getFirst();
            previous = null;
        }

        public boolean atEnd() {
            return (current.next == null);
        }

        public void nextLink() {
            previous = current;
            current = current.next;
        }

        public Link getCurrent() {
            return current;
        }

        /**
         * 在当前节点后面插入节点
         * @param iData
         */
        public void insertAfter(int iData) {
            Link newlink = new Link(iData);

            if (linkList.isEmpty()) {
                current = newlink;
                linkList.setFirst(newlink);
            } else {
                newlink.next = current.next;
                current.next = newlink;
                nextLink(); //把新插入的节点设置为当前节点
            }
        }

        /**
         * 在当前节点的前面插入节点
         * @param iData
         */
        public void insertBefore(int iData) {
            Link newLink = new Link(iData);

            if (previous == null) {
                newLink.next = linkList.getFirst();
                linkList.setFirst(newLink);
                reset();
            } else {
                newLink.next = previous.next;
                previous.next = newLink;
                current = newLink;
            }
        }

        public int deleteCurrent() {
            int data = current.data;

            if (previous == null) {
                linkList.setFirst(current.next);
                reset();
            } else {
                previous.next = current.next;

                if (atEnd())
                    reset();
                else
                    current = current.next;
            }

            return data;
        }

    }

}
