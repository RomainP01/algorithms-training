package com.example.RomainP01.algorithmstraining.codingame.easy;

import java.util.Scanner;

public class Temperatures {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int closest = Integer.MAX_VALUE;
        if(n == 0){
            closest =0;
        }
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            if(Math.abs(closest)>Math.abs(t)){
                closest = t;
            }
            if(Math.abs(closest) == t){
                closest = Math.abs(closest);
            } // a temperature expressed as an integer ranging from -273 to 5526
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(closest);
    }
}
