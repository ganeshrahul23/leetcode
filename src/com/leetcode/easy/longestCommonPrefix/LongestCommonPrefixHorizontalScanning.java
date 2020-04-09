package com.leetcode.easy.longestCommonPrefix;

//Problem 14
public class LongestCommonPrefixHorizontalScanning {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) return "";
        if (strs.length == 1) return strs[0];
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            //This while loop is used to find the common Longest Prefix between two string
            // If the result of index is 0, then the prefix is the common longest prefix
            // between prefix and strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                //If the prefix is empty, there is no common longest prefix between prefix
                //and strs[i], so from this we can deduce that the array strs has no commmon
                //prefix substring.
                if (prefix.isEmpty()) return "";
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
