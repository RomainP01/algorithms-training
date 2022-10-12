package com.example.RomainP01.algorithmstraining.isograd.pattern;

import java.util.Scanner;

public class TwoLinesPattern {
    public static void main(String[] argv) throws Exception {
        Scanner sc = new Scanner(System.in);
        var firstLine = sc.nextLine().split(" ");
        var firstNum = Integer.parseInt(firstLine[0]);
        var secondNum = Integer.parseInt(firstLine[1]);
        var secondLine = sc.nextLine().split(" ");
        for(var i =0; i<secondLine.length;i++){
            var currentNum = Integer.parseInt(secondLine[i]);
            if(currentNum==firstNum){

            }
        }
    }
}
