package com.leetcode.easy.removeElement;
//Problem 27

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
//        int point1 = 0;
//        for (int point2 = 0; point2 < nums.length; point2++) {
//            if (nums[point2] != val) {
//                nums[point1++] = nums[point2];
//            }
//        }
//        return point1;
        int point = 0;
        for (int num : nums) {
            if (num != val) nums[point++] = num;
        }
        return point;
    }

    public static void main(String[] args) {
        int[][] out = {
                {1, 1, 2, 2, 2, 2, 2, 3},
        };
        System.out.println(removeElement(out[0], 2));
        System.out.println(Arrays.toString(out[0]));
    }
}
