package com.leetcode.thirtydays.week1.day7;

import java.util.Arrays;
import java.util.HashSet;

public class CountingElementsHashSetStreams {
    public static int countElements(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.stream(arr).forEach(set::add);
        return (int) Arrays.stream(arr).filter(n -> set.contains(n + 1)).count();
    }

    public static void main(String[] args) {
        System.out.println(countElements(new int[]{1, 2, 3}));
        System.out.println(countElements(new int[]{1, 1, 3, 3, 5, 5, 7, 7}));
        System.out.println(countElements(new int[]{1, 3, 2, 3, 5, 0}));
        System.out.println(countElements(new int[]{1, 1, 2, 2}));
    }
}
