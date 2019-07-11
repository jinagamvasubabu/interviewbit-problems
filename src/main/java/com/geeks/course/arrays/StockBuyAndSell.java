package com.geeks.course.arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,2,5}));
    }

    public static int maxProfit(int[] arr) { // 1,5,3,8,12
        if (arr.length == 0 || arr.length == 1) return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int profit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

            if (max < arr[i]) {
                max = arr[i];
                profit += (max - min) > 0 ? max - min : 0;
                min = arr[i];
            }


        }


        return profit;

    }
}
