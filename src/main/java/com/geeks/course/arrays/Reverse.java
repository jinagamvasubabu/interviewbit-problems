package com.geeks.course.arrays;

import java.util.stream.Stream;

public class Reverse {
    public static void main(String[] args) {
        reverse(new int[]{1,2,3,4,5});
    }

    public static void reverse(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            swap(arr, low, high);
            low++;
            high--;
        }

        int i = 0;
        while(i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
