package com.geeks.course.arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {2, 8, 3, 9, 6, 5, 4};
        int computedArr[] = preComputeMaxSum(arr);
        int start = 2, end = 6;
        System.out.println(findMaxSum(start, end, computedArr));
    }

    private static int findMaxSum(int start, int end, int[] computedArr) {
        if (start > 0) {
            start--;
            return computedArr[end] - (computedArr[start]);
        } else {
            return computedArr[end];
        }

    }

    private static int[] preComputeMaxSum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i > 0)
                arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }


}
