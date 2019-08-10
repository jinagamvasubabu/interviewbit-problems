package com.geeks.course.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EquilibriumPoint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int i=0; i<T; i++) {
            int N = s.nextInt();
            int[] arr = new int[N];
            for(int j=0; j<N; j++) {
                arr[j] = s.nextInt();
            }
            System.out.println(findEquilibriumPoint(arr));
            System.out.println();
        }
    }

    private static int findEquilibriumPoint(int[] arr) {
        int sum = 0, left_sum=0;
        for (int anArr : arr) {
            sum += anArr;
        }

        for(int j=0; j<arr.length; j++) {
            sum = sum-arr[j];
            if (sum == left_sum) return j+1;

            left_sum = left_sum+arr[j];

        }

        return -1;
    }
    // naive way
 /*   private static int findEquilibriumPoint(int[] arr) {
        if (arr.length == 1) return arr[0];
        int[] computedArr = Arrays.copyOf(arr, arr.length);
        Map<Integer, Integer> values = new HashMap<>();
        values.put(arr[0], 0);
        for (int i = 1; i < computedArr.length; i++) {
            computedArr[i] += computedArr[i - 1];
            values.put(computedArr[i], i);
        }

        int low = 0, end = computedArr.length-1;
        while(low < end) {
            Integer value = values.get(computedArr[end] - computedArr[low]);
            if (value != null)
                return value+1;
            low++;
        }
        return -1;
    }*/
}
