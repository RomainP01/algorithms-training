package com.example.RomainP01.algorithmstraining.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumSubarray {

    public int maxContiguousSubArray(int[] nums) {
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            for (int j = i; j < nums.length; j++) {
                if (j != i) {
                    sum += nums[j];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    //optimize with Kadane's algorithm
    public int maxContiguousSubArray2(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
