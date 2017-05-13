package com.jbwang.link.chap05;

/**
 * Created by jbwang0106 on 2017/5/12.
 */
public class Josephus {

    public static int getJosephus(int number) {

        CycleLinks cycleLinks = new CycleLinks();

        for (int i = 1; i <= number; i++) {
            cycleLinks.insert(i);  //先将number个人排成一个圆
        }

        System.out.println("现在链表的顺序:");
        cycleLinks.display();
        System.out.println("出圈的顺序：");

        for (int i = 1; i < number; i++) { //最终删掉number-1个人
            for (int j = 1; j < 4; j++) {
                cycleLinks.step();
            }

            System.out.println(cycleLinks.remove() + "");
            //cycleLinks.display();
        }


        return cycleLinks.peek();
    }
    
    public static void main(String [] args) {
        //int josephus = getJosephus(7);
        
      //  System.out.println("josephus的编号为：" + josephus);

        simulate(7,4);
    }

    public static void simulate(int n, int m) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            answer = (answer + m) % i;
            System.out.println("Survival: " + answer);
        }
    }
}
