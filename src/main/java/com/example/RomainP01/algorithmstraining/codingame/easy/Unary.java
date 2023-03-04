package com.example.RomainP01.algorithmstraining.codingame.easy;

import java.util.Scanner;

public class Unary {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine().trim();
        String binary = "";
        for (char c : MESSAGE.toCharArray()) {
            binary+=String.format("%7s", Integer.toBinaryString(c)).replace(' ', '0');
        }
        String[] arr = binary.split("");
        boolean currentIsOne = arr[0].equals("1");
        String out = "";
        String currentStr = currentIsOne?"0 ":"00 ";
        for (String s :arr) {
            if ((s.equals("1")&&currentIsOne) || (s.equals("0")&&!currentIsOne)){
                currentStr+="0";
            }
            else{
                out+=currentStr;
                currentStr=s.equals("1")?" 0 0":" 00 0";
                currentIsOne = !currentIsOne;
            }
        }
        out+=currentStr;
        System.out.println(out);
    }
}
