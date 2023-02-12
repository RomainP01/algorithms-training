package com.example.RomainP01.algorithmstraining.datastructures.array;

public class IntersectionTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[index] = nums1[i];
                    index++;
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] finalResult = new int[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }

}
