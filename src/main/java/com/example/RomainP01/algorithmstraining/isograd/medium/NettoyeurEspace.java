package com.example.RomainP01.algorithmstraining.isograd.medium;

import java.util.*;

public class NettoyeurEspace {
    public static String sortString(String inputString) {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

    public static void main(String[] argv) throws Exception {
        Scanner sc = new Scanner(System.in);
        var firstLine = sc.nextLine();
        var garbages = sc.nextLine().split("");
        var boolean =Arrays.stream(garbages).anyMatch("2");
        var numOfWays = 0;
        for (var i = 0; i < garbages.length; i++) {
            var robot1 = "";
            var robot2 = "";
            var k = 0;
            while (k < garbages.length) {
                if (k + i < garbages.length) {
                    robot1 += garbages[k + i];
                } else {
                    robot1 += garbages[(k + i) - (garbages.length - 1)];
                }
                if (k + i + garbages.length / 2 < garbages.length) {
                    robot1 += garbages[k + i + garbages.length / 2];
                } else {
                    robot1 += garbages[(k + i + garbages.length / 2) - (garbages.length - 1)];
                }
                k += 1;
            }
            if (sortString(robot1).equals(sortString(robot2))) {
                numOfWays += 2;
            }
        }
        System.out.println(numOfWays);

    }
}
