package com.example.RomainP01.algorithmstraining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CurrentAlgo {
    public static ArrayList<String[]> all = new ArrayList<>();
    public static int calculateDistance(int numHouse, int numHouse2){
        String[] first = all.get(numHouse);
        var x = Integer.parseInt(first[0]);
        var y = Integer.parseInt(first[1]);
        var z = Integer.parseInt(first[2]);
        String[] second = all.get(numHouse);
        var x2 = Integer.parseInt(second[0]);
        var y2 = Integer.parseInt(second[1]);
        var z2 = Integer.parseInt(second[2]);
        return Math.abs(x2-x) +Math.abs(y2-y) +Math.abs(z2-z);
    }
    public static void cal(){

    }
    public static void main(String[] argv) throws Exception {
        Scanner sc = new Scanner(System.in);
        var line0 = sc.nextLine().split(" ");
        var line1 = sc.nextLine().split(" ");
        var line2 = sc.nextLine().split(" ");
        var line3 = sc.nextLine().split(" ");
        var line4 = sc.nextLine().split(" ");
        var line5 = sc.nextLine().split(" ");
        var line6 = sc.nextLine().split(" ");
        var line7 = sc.nextLine().split(" ");
        all.add(line0);
        all.add(line1);
        all.add(line2);
        all.add(line3);
        all.add(line4);
        all.add(line5);
        all.add(line6);
        all.add(line7);
        var string = "0 ";
        for (int i=0;i<all.size();i++){

        }
        System.out.println(string);

    }
}
