package com.example.RomainP01.algorithmstraining.math;

public class Kadane {
    public static int maxContiguousSubArray(int[] nums) {
       int meh = 0, msf = Integer.MIN_VALUE;
         for (int i = 0; i < nums.length; i++) {
              meh = meh + nums[i];
              if (meh < nums[i])
                meh = nums[i];
              if (msf < meh)
                msf = meh;
         }
            return msf;
    }
}
