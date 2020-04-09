package com.leetcode.easy.validParentheses;
//Problem 20

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '[')
                stack.push(']');
            else if (c == '{')
                stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] inputs = {
                "()",
                "()[]{}",
                "(]",
                "(()[]{}",
        };
        for (String input : inputs) {
            System.out.println(isValid(input));
        }
    }
}
