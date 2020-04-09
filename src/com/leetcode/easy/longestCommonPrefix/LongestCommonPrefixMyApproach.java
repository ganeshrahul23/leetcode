package com.leetcode.easy.longestCommonPrefix;

//Problem 14
public class LongestCommonPrefixMyApproach {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) return "";
        if (strs.length == 1) return strs[0];

        int minIndex = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (minLength > strs[i].length()) {
                minLength = strs[i].length();
                minIndex = i;
            }
        }

        String swap = strs[minIndex];
        strs[minIndex] = strs[0];
        strs[0] = swap;

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (c != strs[j].charAt(i)) return strs[0].substring(0, i);
            }
            sb.append(c);
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String[][] inputs = {
                {},
                {"dummy"},
                {"flower", "flow", "flight"},
                {"dog", "racecar", "car"},
        };
        String[] outputs = {
                "",
                "dummy",
                "fl",
                "",
        };
        for (int i = 0; i < outputs.length; i++) {
            String out = longestCommonPrefix(inputs[i]);
            System.out.println("The Result is " + out + " and the result is " + (out.equals(outputs[i]) ? "Correct" : "Not Correct"));
            if (!out.equals(outputs[i]))
                System.out.println("Expected output is " + outputs[i]);
        }
    }
}
