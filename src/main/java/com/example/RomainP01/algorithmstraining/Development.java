package com.example.RomainP01.algorithmstraining;

import java.util.*;

public class Development {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String line = in.nextLine();
        String[] arr = line.split("");
        for (int i = 0; i < h; i++) {
            String res = "";
            for (int j = 0; j < w; j++) {
                res+=arr[i%w];
            }
            System.out.println(res);
            // Write an answer using System.out.println()
            // To debug: System.err.println("Debug messages...");
        }
    }
}
