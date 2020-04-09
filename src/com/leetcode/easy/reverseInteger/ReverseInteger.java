package com.leetcode.easy.reverseInteger;

//Problem - 7
public class ReverseInteger {
    public static int reverse(int x) {
        long temp = 0;
        while (x != 0) {
            temp = (temp * 10) + (x % 10);
            x = x / 10;
        }
        if (temp >= Integer.MIN_VALUE && temp <= Integer.MAX_VALUE)
            return (int) temp;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
