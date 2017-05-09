package com.jbwang.stackqueue;

/** 检查分隔符是否匹配
 * Created by jbwang0106 on 2017/5/8.
 */
public class BracketChecker {

    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check() {
        int length = input.length();
        StackY stack = new StackY(length);

        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                case ']':
                case '}':
                    if (!stack.isEmpty()) {
                        char chx = stack.pop();
                        if ((ch == ')' && chx != '(') ||
                                (ch == ']' && chx != '[') ||
                                (ch == '}' && chx != '{')) {
                            System.out.println("Error: " + ch +" at" + i);
                        } else
                            System.out.println("匹配成功: " + ch);
                    } else {
                        System.out.println("Error: " + ch +" at" + i);
                    }
                    break;
                default:
                    break;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Error: miss right delimiter");
        }
    }
}
