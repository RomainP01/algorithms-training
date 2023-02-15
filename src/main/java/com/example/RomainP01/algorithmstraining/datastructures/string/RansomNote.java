package com.example.RomainP01.algorithmstraining.datastructures.string;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        //count the number of each letter in magazine
        for(int i=0; i<magazine.length(); i++){
            //count[0] = count['a'-'a'] = count[0] + 1
            count[magazine.charAt(i)-'a']++;
        }
        for(int i=0; i<ransomNote.length(); i++){
            //if the letter in ransomNote is not in magazine, return false
            if(count[ransomNote.charAt(i)-'a']<=0){
                return false;
            }else{
                //if the letter in ransomNote is in magazine, decrease the count
                count[ransomNote.charAt(i)-'a']--;
            }
        }
        return true;
    }
}
