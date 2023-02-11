package com.example.RomainP01.algorithmstraining.tools;

//Kadane's algorithm
//meh = max ending here
//msf = max so far
//https://www.youtube.com/watch?v=YxuK6A3SvTs&t=224s
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
