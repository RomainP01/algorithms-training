package com.example.RomainP01.algorithmstraining.datastructures.array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> r = new ArrayList<>();
            for (int j = 0; j <=i ; j++) {
                if(j-i<=0 || i==0){
                    r.add(1);
                }
                else{
                    List<Integer> l = result.get(i-j);
                    r.add(l.get(j-1) + l.get(j));
                }
            }
            result.add(r);
        }
        return result;
    }
}
