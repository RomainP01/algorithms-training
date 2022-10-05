package com.example.RomainP01.algorithmstraining.isograd.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NettoyeurEspace {
    public static void main( String[] argv ) throws Exception {
        Scanner sc = new Scanner(System.in);
        var garbages = sc.nextLine().split("");
        var numOfWays =0;
        Map<String,Integer> allLetters =new HashMap<>() ;
        for(String g:garbages){
            allLetters.computeIfPresent(g,(k,v)->v+1);
            allLetters.computeIfAbsent(g,k->allLetters.put(k,1));
        }

    }
}
