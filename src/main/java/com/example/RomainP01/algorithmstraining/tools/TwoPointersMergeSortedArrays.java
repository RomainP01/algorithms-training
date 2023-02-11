package com.example.RomainP01.algorithmstraining.tools;

//Two pointers method:
//The idea is to start from the end of the first array and the end of the second array.
//Compare the last element of the first array and the last element of the second array.
//If the last element of the first array is greater than the last element of the second array,
//then the last element of the first array is the largest element in the first array.
//So, we put the last element of the first array at the end of the first array.
//If the last element of the first array is smaller than the last element of the second array,
//then the last element of the second array is the largest element in the second array.
//So, we put the last element of the second array at the end of the first array.
//We repeat this process until we reach the beginning of the first array.
//If we reach the beginning of the first array, then we still have elements in the second array.
//We put all the elements in the second array at the beginning of the first array.
//Time complexity: O(m+n)
//Space complexity: O(1)
public class TwoPointersMergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    //optimize space but not time
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
