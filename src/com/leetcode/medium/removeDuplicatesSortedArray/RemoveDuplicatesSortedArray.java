package com.leetcode.medium.removeDuplicatesSortedArray;

import java.util.Arrays;

//Problem 80
public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        if (nums.length == 2) return 2;
//        int point = 0;
//        for(int num : nums) {
//            if (point < 2 || num != nums[point - 2]) {
//                nums[point++] = num;
//            }
//        }
//        return point;
        int point1 = 2;
        for (int point2 = point1; point2 < nums.length; point2++) {
            if (nums[point2] != nums[point1 - 2]) {
                nums[point1++] = nums[point2];
            }
        }
        return point1;
    }

    public static void main(String[] args) {
        int[][] out = {
                {1, 1, 1, 2, 2, 2, 3, 3},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
        };

        for (int i = 0; i < out.length; i++) {
            System.out.println(removeDuplicates(out[i]));
            System.out.println(Arrays.toString(out[i]));
        }
    }
}
