package com.leetcode.easy.twoSum;

import java.util.Arrays;

//Problem - 1
public class TwoSumLoop {
    public static int[] twoSum(int[] nums, int target) {
        int arrLength = nums.length;
        for (int i = 0; i < arrLength; i++) {
            for (int j = i + 1; j < arrLength; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
