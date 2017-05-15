package com.jbwang.recursive;

/**
 * 使用递归实现二分查找法
 * Created by jbwang0106 on 2017/5/13.
 */
public class OrderArray {

    public int nElems;
    public Long[] orderArray;

    public OrderArray(int maxSize) {
        orderArray = new Long[maxSize];
        nElems = 0;
    }

    public void insert(long value) {

        int j;
        for (j = 0; j < nElems; j++) {
            if (orderArray[j] > value)
                break;
        }
        for (int k = nElems; k > j; k--) {
            orderArray[k] = orderArray[k-1];
        }

        orderArray[j] = value;
        nElems++;
    }

    public int size() {
        return nElems;
    }


    public int find (long serachKey) {
        return recFind(serachKey, 0, nElems-1);
    }

    private int recFind(long searchKey, int lowerBound, int upperBound) {
        int curIn;
        curIn = (lowerBound+upperBound)/2;
        if (orderArray[curIn] == searchKey)
            return curIn;
        else if (lowerBound > upperBound)
            return nElems;
        else {
            if (orderArray[curIn] < searchKey)
                return recFind(searchKey,curIn+1,upperBound);
            else
                return recFind(searchKey,lowerBound,curIn-1);
        }

    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(orderArray[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String [] args) {

        OrderArray orderArray = new OrderArray(100);

        orderArray.insert(20);
        orderArray.insert(45);
        orderArray.insert(12);
        orderArray.insert(67);
        orderArray.insert(90);
        orderArray.insert(69);
        orderArray.insert(86);
        orderArray.insert(11);
        orderArray.insert(9);
        orderArray.insert(43);
        orderArray.insert(65);
        orderArray.insert(79);
        orderArray.insert(89);
        orderArray.insert(91);
        orderArray.insert(55);
        orderArray.insert(59);
        orderArray.insert(75);
        orderArray.display();

        int searchKey = 69;

        if (orderArray.find(searchKey) != orderArray.nElems)
            System.out.println("find search");
        else 
            System.out.println("can not find searchKey");

    }
}
