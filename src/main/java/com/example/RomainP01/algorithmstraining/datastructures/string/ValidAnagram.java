package com.example.RomainP01.algorithmstraining.datastructures.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        List<String> sList = Arrays.asList(s.split(""));
        List<String> tList = Arrays.asList(t.split(""));
        Collections.sort(sList);
        Collections.sort(tList);
        if (tList.equals(sList)){
            return true;
        }
        return false;
    }

    //optimized
    public boolean isAnagram2(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
