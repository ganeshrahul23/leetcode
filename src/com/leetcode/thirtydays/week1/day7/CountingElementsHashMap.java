package com.leetcode.thirtydays.week1.day7;

import java.util.HashMap;

public class CountingElementsHashMap {
    public static int countElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr)
            map.put(n, map.getOrDefault(n, 0) + 1);
        int count = 0;
        for (int n : map.keySet()) {
            if (map.containsKey(n + 1)) count += map.get(n);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countElements(new int[]{1, 2, 3}));
        System.out.println(countElements(new int[]{1, 1, 3, 3, 5, 5, 7, 7}));
        System.out.println(countElements(new int[]{1, 3, 2, 3, 5, 0}));
        System.out.println(countElements(new int[]{1, 1, 2, 2}));
    }
}
