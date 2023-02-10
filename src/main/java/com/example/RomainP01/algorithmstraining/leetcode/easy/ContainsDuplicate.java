package com.example.RomainP01.algorithmstraining.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    //not optimal
    public boolean containsDuplicate(int[] nums) {
        boolean contained = false;
        for(int i=0;i<nums.length;i++){
            for (int j = 0; j < nums.length; j++) {
                if(i!=j){
                    if(nums[i]==nums[j]){
                        return true;
                    }
                }
            }
        }
        return contained;
    }

    public boolean containsDuplicate2(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
