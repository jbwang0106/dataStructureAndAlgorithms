package com.jbwang.array;

/** 测试highArray类
 * Created by jbwang0106 on 2017/5/4.
 */
public class HighArrayApp {

    public static void main(String [] args) {

        HighArray array = new HighArray(100);

        long maxElem = array.getMax();
        if(maxElem != -1) 
            System.out.println("最大值为：" + maxElem);
        else 
            System.out.println("数组为空");
            
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

        maxElem = array.getMax();
        if(maxElem != -1)
            System.out.println("最大值为：" + maxElem);
        else
            System.out.println("数组为空");

        
        long [] newArray = new long[array.size()];
        for (int j = 0;j < 10; j++) {
            long removeMax = array.removeMax();
            newArray[j] = removeMax;
        }
        
        for (int k = 0; k < newArray.length; k++) {
            System.out.print(newArray[k] + " ");
        }
        
        System.out.println("");

        //遍历
        array.display();
        
        //查找
        boolean b = array.find(33);
        if(b)
            System.out.println("找到元素：" + 33);
        else
            System.out.println("未找到元素：" + 33);

        //删除
        array.delete(99);
        array.delete(33);
        array.delete(55);

        maxElem = array.getMax();
        if(maxElem != -1)
            System.out.println("最大值为：" + maxElem);
        else
            System.out.println("数组为空");

        array.removeMax();

        //查找
        b = array.find(33);
        if(b)
            System.out.println("找到元素：" + 33);
        else
            System.out.println("未找到元素：" + 33);

        //遍历
        array.display();
        
        System.out.println("===========删除重复元素==========");
        HighArray highArray = new HighArray(100);
        highArray.insert(11);
        highArray.insert(99);
        highArray.insert(11);
        highArray.insert(33);
        highArray.insert(11);
        highArray.insert(55);
        highArray.insert(11);
        highArray.insert(77);
        highArray.insert(11);
        highArray.insert(99);
        highArray.insert(11);
        highArray.insert(66);
        highArray.insert(11);
        highArray.insert(00);
        highArray.insert(11);

        System.out.println("去重前：");
        highArray.display();
        //进行去重
        highArray.noDup();
        System.out.println("去重后：");
        highArray.display();

    }
}
