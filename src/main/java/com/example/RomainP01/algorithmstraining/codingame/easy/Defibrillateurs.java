package com.example.RomainP01.algorithmstraining.codingame.easy;

import java.util.Scanner;

public class Defibrillateurs {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String LON = in.next();
        Double lonA = Double.parseDouble(LON.replace(",","."));
        String LAT = in.next();
        Double latA = Double.parseDouble(LAT.replace(",","."));
        int N = in.nextInt();
        double minDistance = Double.MAX_VALUE;
        String nameMin ="";
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            String[] arr = DEFIB.split(";");
            double lonB = Double.parseDouble(arr[4].replace(",","."));
            double latB = Double.parseDouble(arr[5].replace(",","."));
            double pi = 3.141592;
            double R = 6378.137;
            double d =  (R * Math.acos(Math.cos(latB * pi / 180) * Math.cos(latA * pi / 180) * Math.cos(lonB * pi / 180 - lonA * pi / 180) + Math.sin(latB * pi / 180) * Math.sin(latA * pi / 180)));

            if (d<minDistance){
                minDistance=d;
                nameMin = arr[1];
            }
        }
        System.out.println(nameMin);
    }
}
