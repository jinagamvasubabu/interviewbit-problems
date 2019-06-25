package com.geeks.course.arrays;

public class rotate {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 6, 8, 10};
        int d = 2;
        rotateArr(arr, d);
    }

    public static void rotateArr(int[] arr, int d) {
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }

    }

    public static void reverse(int[] arr, int low, int high) {
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
    }


}
