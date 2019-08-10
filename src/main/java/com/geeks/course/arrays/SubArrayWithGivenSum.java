package com.geeks.course.arrays;

import java.util.Scanner;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int i=0; i<T; i++) {
            int N = s.nextInt();
            int target = s.nextInt();
            int[] arr = new int[N];
            for(int j=0; j<N; j++) {
                arr[j] = s.nextInt();
            }
            findSum(arr, target);
            //System.out.println();
        }
    }

    private static void findSum(int[] arr, int target) {
        int start = 0, end = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum == target) {
                start = start+1;
                end = end+1;
                System.out.print(start + " " + end);
                break;
            }
            sum = sum+arr[i];
            end = i;
            if (sum > target) {
                sum = sum-arr[start];
                start++;
            }
        }
    }
}
