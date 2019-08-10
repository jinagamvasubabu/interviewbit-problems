package com.geeks.course.arrays;


public class Sort012 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,0,0,1,2,1};
        sort(arr);
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    private static void sort(int[] arr) {
        int pivot = 1, low = 0, end = arr.length - 1;

        while (low <= end && pivot < arr.length) {
            if (arr[low] > arr[pivot]) {
                swap(arr, low, pivot);
                low++;
            } else if (arr[end] < arr[pivot]) {
                swap(arr, end, pivot);
                end--;
            } else {
                pivot++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
