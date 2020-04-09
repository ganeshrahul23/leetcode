package com.leetcode.easy.palindromeNumber;

//Problem 9
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf *= 10;
            reversedHalf += (x % 10);
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
        // When the length is an odd number, we can get rid of the middle digit by reversedHalf/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, reversedHalf = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(1223221));
    }
}
