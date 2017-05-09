package com.jbwang.stackqueue;

/**
 * Created by jbwang0106 on 2017/5/8.
 */
public class BracketCheckerApp {

    public static void main(String [] args) {
        String input = "a{b[c(de]f}g)";
        BracketChecker bracketChecker  = new BracketChecker(input);
        bracketChecker.check();
     }
}
