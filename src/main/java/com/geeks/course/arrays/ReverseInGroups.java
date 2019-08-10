package com.geeks.course.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseInGroups {
    public static void main(String[] args) throws IOException {

        int T, N = 0, K = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            K = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(br.readLine());
            }
            reverseInGroups(arr, N, K);
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println();
        }


    }


    private static void reverseInGroups(int[] arr, int N, int k) {

        int left = 0, right = 0;
        for (int i = 0; i < N; i+=k) {
            left = i;
            right = Math.min(i+k-1, N-1);
            while(left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    /*private static void reverseInGroups(int[] arr, int N, int K) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < N; i++) {
            count++;
            if (count == K) {
                reverse(arr, j, i);
                j += count;
                count = 0;
            }
        }
    }

    private static void reverse(int[] arr, int low, int high) {
        while (low < high) {
            swap(arr, low, high);
            low++;
            high--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }*/
}
