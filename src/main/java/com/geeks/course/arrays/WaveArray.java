package com.geeks.course.arrays;

import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }
            sortWaveForm(arr);
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void sortWaveForm(int[] arr) {
        boolean flag = true; // down, false - up
        int low = 0, end = arr.length - 1;
        while (low < end) {
            if (flag) { // down
                if (arr[low] < arr[low + 1]) {
                    swap(arr, low, low + 1);
                    low++;
                } else {
                    low++;
                }
                flag = false;
            } else { // up
                if (arr[low] > arr[low + 1]) {
                    swap(arr, low, low + 1);
                    low++;
                } else {
                    low++;
                }
                flag = true;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
