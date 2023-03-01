package com.example.RomainP01.algorithmstraining.codingame.easy;

import java.util.Scanner;

public class TheDescent {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // game loop
        while (true) {
            int highest = 0;
            int m = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt();
                if(mountainH>highest){
                    highest = mountainH;
                    m = i;
                }
            }
            System.out.println(m);

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            // The index of the mountain to fire on.
        }
    }
}
