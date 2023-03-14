package com.example.RomainP01.algorithmstraining.codingame.medium;

import java.util.Scanner;

public class ThereIsNoSpoonEP1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();
        String[][] all = new String[height][width];
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < height; i++) {
            String line = in.nextLine();
            all[i] = line.split("");
        }
        for (int i = 0; i < height; i++) {
            String downNeighbor = "";
            String rightNeighbor = "";
            for (int j = 0; j < width; j++) {
                if (all[i][j].equals(".")) {

                } else {
                    if (i + 1 >= height) {
                        downNeighbor = "-1 -1";
                    } else {
                        boolean found = false;
                        for (int k = i+1; k < height; k++) {
                            if (!all[k][j].equals(".")) {
                                downNeighbor = j + " " + k;
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            downNeighbor = "-1 -1";
                        }
                    }
                    if (j + 1 >= width) {
                        rightNeighbor = "-1 -1";
                    } else {
                        boolean found = false;
                        for (int k = j+1; k < width; k++) {
                            if (!all[i][k].equals(".")) {
                                rightNeighbor = k + " " + i;
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            rightNeighbor = "-1 -1";
                        }
                    }
                    System.out.println(j + " " + i + " " + rightNeighbor + " " + downNeighbor);
                }
            }
        }
    }
}
