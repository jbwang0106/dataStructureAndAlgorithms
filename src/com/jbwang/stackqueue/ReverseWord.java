package com.jbwang.stackqueue;

/** 进行单词的反转
 * Created by jbwang0106 on 2017/5/8.
 */
public class ReverseWord {

    /**
     * 输入的单词
     */
    private String input;

    /**
     * 输出的单词
     */
    private String output;

    public ReverseWord(String input) {
        this.input = input;
    }

    public String doRev() {

        int stackSize = input.length();
        StackY stack = new StackY(stackSize);

        for (int i = 0; i < stackSize; i++) {
            char c = input.charAt(i);
            stack.push(c);
        }

        output = "";
        while (!stack.isEmpty()) {
            char pop = stack.pop();
            output += pop;
        }

        return output;
    }
}
