package com.example.RomainP01.algorithmstraining.codingame.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShadowsOfTheKnightEP1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        int left = 0;
        int right = W;
        int top = 0;
        int bottom = H;

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            List<String> list = new ArrayList<>();
            if (bombDir.length() == 2) {
                list.add(bombDir.substring(0,1));
                list.add(bombDir.substring(1));
            } else {
                list.add(bombDir);
            }
            for (String s : list) {
                switch (s) {
                    case "U":
                        bottom = Y0;
                        break;
                    case "R":
                        left = X0;
                        break;
                    case "D":
                        top = Y0;
                        break;
                    case "L":
                        right = X0;
                        break;
                }
            }
            int newX = (right + left) / 2;
            int newY = (top + bottom) / 2;
            X0 = newX;
            Y0 = newY;
            System.out.println(newX + " " + newY);
        }
    }


}
