package com.example.RomainP01.algorithmstraining;

import java.util.*;

public class Development {

    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n)
    {
        var allSums = new ArrayList<Integer>();
        int total = 1 << n;
        for (int i = 0; i < total; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) != 0)
                    sum += arr.get(j);

            allSums.add(sum);
        }
        Collections.sort(allSums);
        return allSums;
    }
    static ArrayList<Integer> subsetSumsRec(ArrayList<Integer> arr, int l, int r, int sum)
    {
        var allSums = new ArrayList<Integer>();
        if (l > r) {
            allSums.add(sum);
            return allSums;
        }
        allSums.addAll(subsetSumsRec(arr, l + 1, r, sum + arr.get(l)));
        allSums.addAll(subsetSumsRec(arr, l + 1, r, sum));
        Collections.sort(allSums);
        return allSums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var firstLine = sc.nextLine().split(" ");
        var soldats = Integer.parseInt(firstLine[0]);
        var secondLine = sc.nextLine().split(" ");
        var groupes = Integer.parseInt(secondLine[0]);
        var allEffectifs = new ArrayList<Integer>();
        for(var i =0; i<groupes;i++){
            var line = sc.nextLine().split(" ");
            var merc = Integer.parseInt(line[0]);
            allEffectifs.add(merc);
        }
        var allSums =subsetSumsRec(allEffectifs, 0, groupes - 1, 0);
        System.out.println(allSums);
        var total = 0;
        for (Integer s: allEffectifs){
            total+=s;
        }
        for (Integer sum : allSums){
            if (soldats + sum > total-sum){
                System.out.println(sum);
                break;
            }

        }

    }
}
