package com.leetcode.toUnderstand.easy.implementStrStr;

//Problem 28
public class ImplementStrStrMyApproach {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int hayLen = haystack.length();
        int needLen = needle.length();
        if (hayLen == 0 || needLen > hayLen) return -1;
        //haystack = "hello", needle = "ll"
        char needFirst = needle.charAt(0);
        for (int i = 0; i < hayLen; i++) {
            while (i < hayLen && needFirst != haystack.charAt(i)) i++;
            int j = 0;
            for (j = i + 1; (j - i) < needLen; j++) {
                if (haystack.charAt(j) != needle.charAt(j - i)) break;
            }
            if (j - i == needLen) return i;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
