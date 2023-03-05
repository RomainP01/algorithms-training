package com.example.RomainP01.algorithmstraining.codingame.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MIMEType {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String EXT = in.next().toLowerCase(); // file extension
            String MT = in.next(); // MIME type.
            map.put(EXT, MT);
        }
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine();// One file name per line.
            if (FNAME.contains(".") && FNAME.charAt(FNAME.length()-1)!='.') {
                System.out.println(map.getOrDefault(FNAME.split("\\.")[FNAME.split("\\.").length-1].toLowerCase(), "UNKNOWN"));
            } else {
                System.out.println("UNKNOWN");
            }
        }
    }
}
