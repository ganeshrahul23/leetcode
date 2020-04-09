package com.leetcode.toUnderstand.easy.backspaceStringCompare;

import java.util.Stack;

public class BackspaceStringCompareStack {
    public static boolean backspaceCompare(String S, String T) {
        return getString(S).equals(getString(T));
    }

    private static String getString(String str) {
        Stack<Character> st = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c != '#')
                st.push(c);
            else if (!st.isEmpty())
                st.pop();
        }
        return String.valueOf(st);
    }
}
