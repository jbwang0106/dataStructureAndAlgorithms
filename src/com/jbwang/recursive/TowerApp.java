package com.jbwang.recursive;

/**
 * 汉诺塔问题
 * Created by jbwang0106 on 2017/5/13.
 */
public class TowerApp {

    public static void main(String [] args) {
        int nDisks = 3;
        doTower(nDisks, 'A', 'B', 'C');
    }

    public static void doTower(int nDisks, char from, char inner, char to) {
        System.out.println("Entering : " + nDisks + ",s = " + from + ",i = " + inner + ",d = " + to);
        if (nDisks == 1) {
            System.out.println("Disk 1 from " + from + " to " + to); //如果只有一个盘子，那就直接移动到目标圆柱上
        }
        else {
            doTower(nDisks-1, from, to, inner); //把n-1的盘子移动到中间那圆柱上
            System.out.println("Disk " + nDisks + " from " + from + " to " + to); //把最后一个盘子移动到目标圆柱上
            doTower(nDisks-1, inner, from, to); //把中间的n-1个盘子移动到目标圆柱上

        }
            
    }
}
