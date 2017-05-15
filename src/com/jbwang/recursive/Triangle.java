package com.jbwang.recursive;

/**
 * 三角数字使用递归实现
 * 阶乘使用递归实现
 * 验证公式为(n^2+n)/2
 * Created by jbwang0106 on 2017/5/13.
 */
public class Triangle {
    
    public static void main(String [] args) {
        int triangle = triangle(5);
        System.out.println("第n项的值为：" + triangle);
        int factorial = factorial(5);
        System.out.println("第n项的阶乘为：" + factorial);
    }

    /**
     * 三角数字的递归实现
     * @param n
     * @return
     */
    public static int triangle(int n){
        System.out.println("Entering: " + n);
        if (n == 1) {
            System.out.println("Returning: 1");
            return 1;
        } else {
            int temp = n + triangle(n - 1);
            System.out.println("Returning: " + temp);
            return temp;
        }
        
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n-1);

    }
}
