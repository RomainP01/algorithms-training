package com.example.RomainP01.algorithmstraining.codingame.easy;

import java.util.*;

public class ASCIIArt {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        Map<String, List<String>> dict = new HashMap<>();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        T = T.toUpperCase();
        while(in.hasNextLine()){
            String currentLine = in.nextLine();
            for (int i = 0; i <27 ; i++) {
                String letter = currentLine.substring(0,L);
                currentLine = currentLine.substring(L);
                String s =i==26?"?":String.valueOf((char)(i + 65)).toUpperCase();
                if(dict.containsKey(s)){
                    dict.get(s).add(letter);
                }else{
                    List<String> l = new ArrayList<>();
                    l.add(letter);
                    dict.put(s,l);
                }
            }
        }
        String[] arr = T.split("");
        for (int i = 0; i <H ; i++) {
            String total = "";
            for (String str: arr){
                if (dict.containsKey(str)){
                    total+=dict.get(str).get(i);
                }else{
                    total+=dict.get("?").get(i);
                }
            }
            System.out.println(total);
        }
    }
}
