package com.example.RomainP01.algorithmstraining.tools;

import java.util.ArrayList;
import java.util.Collections;

//Subsets Sum
//Given an array of integers, find all possible subsets of the array and return the sum of all the subsets.
public class SubsetsSum {
    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n)
    {
        var allSums = new ArrayList<Integer>();
        int total = 1 << n;
        for (int i = 0; i < total; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) != 0)
                    sum += arr.get(j);

            allSums.add(sum);
        }
        Collections.sort(allSums);
        return allSums;
    }
    static ArrayList<Integer> subsetSumsRec(ArrayList<Integer> arr, int l, int r, int sum)
    {
        var allSums = new ArrayList<Integer>();
        if (l > r) {
            allSums.add(sum);
            return allSums;
        }
        allSums.addAll(subsetSumsRec(arr, l + 1, r, sum + arr.get(l)));
        allSums.addAll(subsetSumsRec(arr, l + 1, r, sum));
        Collections.sort(allSums);
        return allSums;
    }
}
