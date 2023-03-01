package com.example.RomainP01.algorithmstraining.codingame.easy;

import java.util.Scanner;

public class PowerOfThorEP1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            System.err.println(remainingTurns);
            String direction = "";
            if (lightY < initialTy) {
                direction += "N";
                initialTy -= 1;
            }
            if (lightY > initialTy) {
                direction += "S";
                initialTy += 1;
            }
            if (lightX < initialTx) {
                direction += "W";
                initialTx += 1;
            }

            if (lightX > initialTx) {
                direction += "E";
                initialTx = 1;
            }
            System.out.println(direction);


            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // A single line providing the move to be made: N NE E SE S SW W or NW

        }
    }
}
