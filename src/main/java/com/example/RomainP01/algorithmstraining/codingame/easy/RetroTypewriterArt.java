package com.example.RomainP01.algorithmstraining.codingame.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RetroTypewriterArt {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();
        map.put("sp"," ");
        map.put("bS", "\\");
        map.put("sQ","'");
        String T = in.nextLine();
        String[] arr = T.split(" ");
        String result = "";
        for (String s:arr){
            if(s.equals("nl")){
                System.out.println(result);
                result = "";
            }else{
                String[] sArr = s.split("");
                String total = "";
                if (Character.isDigit(s.charAt(s.length()-1))){
                    String end = s.substring(sArr.length-1);
                    String tt = s.substring(0,sArr.length-1);
                    Integer endI = Integer.parseInt(tt);
                    for (int i = 0; i <endI ; i++) {
                        result+=end;
                    }
                }
                else{
                    int i = 0;
                    while(Character.isDigit(s.charAt(i))){
                        total+=sArr[i];
                        i++;
                    }
                    String c = s.substring(i);
                    Integer times = Integer.parseInt(total);
                    for (int j = 0; j <times ; j++) {
                        if (map.containsKey(c)) {
                            result+=map.get(c);
                        } else {
                            result+=c;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
