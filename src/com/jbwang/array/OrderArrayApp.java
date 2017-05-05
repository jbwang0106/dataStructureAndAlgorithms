package com.jbwang.array;

/** orderArray的测试类
 * Created by jbwang0106 on 2017/5/4.
 */
public class OrderArrayApp {

    public static void main(String [] args) {

        OrderArray array = new OrderArray(100);

        array.insert(11);
        array.insert(55);
        array.insert(77);
        array.insert(88);
        array.insert(00);
        array.insert(33);
        array.insert(66);
        array.insert(99);
        array.insert(44);
        array.insert(22);

        //遍历
        array.display();

        long [] a = {12,23,34,45,56,67,78,89,90};
        OrderArray merge = array.merge(a);
        System.out.println("遍历合并后的数组: ");
        merge.display();

        //查找
        int b = array.find(33);
        if(b != array.size())
            System.out.println("找到元素：" + 33);
        else
            System.out.println("未找到元素：" + 33);

        //删除
        array.delete(99);
        array.delete(33);
        array.delete(55);

        //查找
        b = array.find(33);
        if(b != array.size())
            System.out.println("找到元素：" + 33);
        else
            System.out.println("未找到元素：" + 33);

        //遍历
        array.display();


    }
}
