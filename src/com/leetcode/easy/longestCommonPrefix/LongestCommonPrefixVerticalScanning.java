package com.leetcode.easy.longestCommonPrefix;

//Problem 14
public class LongestCommonPrefixVerticalScanning {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                // i == strs[j].length() is used to check whether i became
                // greater than the length of strs[j]
                if (i == strs[j].length() || c != strs[j].charAt(i)) return prefix.substring(0, i);
            }
        }
        return prefix;
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
