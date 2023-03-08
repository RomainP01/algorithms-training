package com.example.RomainP01.algorithmstraining.codingame.easy;

import java.util.*;

public class ChevauxDeCourse {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[1] - arr[0];
        for (int i = 2; i < N; i++) {
            if (arr[i] - arr[i - 1] < min) {
                min = arr[i] - arr[i - 1];
            }
        }
        System.out.println(min);
    }
}
