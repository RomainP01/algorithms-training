package com.example.RomainP01.algorithmstraining.datastructures.array;

public class BestTimeToBuyAndSellStock {
    //not optimized
    public int maxProfit(int[] prices) {
        int maxP = 0;
        for (int i = 0; i < prices.length ; i++) {
            for (int j = i; j < prices.length; j++) {
                if (prices[j]-prices[i] >maxP){
                    maxP=prices[j]-prices[i];
                }
            }
        }
        return maxP;
    }

    //optimized
    public int maxProfit2(int[] prices) {
        int maxP = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length ; i++) {
            if(prices[i]<min){
                min=prices[i];
            }else if(prices[i]-min>maxP){
                maxP=prices[i]-min;
            }
        }
        return maxP;
    }
}
