package com.leetcode.easy.romanToInteger;

//Problem 13
public class RomanToInteger {
    public static int romanToInt(String s) {
        int prev = 0, sum = 0, curr = 0;
        int sLength = s.length();
        char[] sArr = s.toCharArray();
        for (int i = sLength - 1; i >= 0; i--) {
            curr = getValue(sArr[i]);
            if (curr < prev) {
                sum -= curr;
            } else {
                sum += curr;
            }
            prev = curr;
        }
        return sum;
    }

    private static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("IV"));
    }
}
