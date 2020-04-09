package com.leetcode.easy.removeDuplicatesSortedArray;
//Problem 26

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
//        int point1 = 0, point2 = 1;
//        while (point2 < nums.length) {
//            if (nums[point1] != nums[point2]) {
//                nums[++point1] = nums[point2];
//            }
//            point2++;
//        }
        int point1 = 1;
        for (int point2 = point1; point2 < nums.length; point2++) {
            if (nums[point1 - 1] != nums[point2]) {
                nums[point1++] = nums[point2];
            }
        }
        return point1;
    }

    public static void main(String[] args) {
        int[][] out = {
                {1, 1, 2, 2, 2, 3},
        };

        for (int i = 0; i < out.length; i++) {
            System.out.println(removeDuplicates(out[i]));
            System.out.println(Arrays.toString(out[i]));
        }
    }
}
