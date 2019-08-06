package com.geeks.course.arrays;

public class WindowSlidingTechnique {
    public static void main(String[] args) {
        System.out.println(maxConsequtiveSum(2, new int[] { 5, 10, 6, 90, 3}));
    }

    public static int maxConsequtiveSum(int k, int[] arr) { // 1, 8, 30, -5, 20, 7
        if (k == 0) return 0;

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int max_so_far = 0;
            int counter = 0;
            int j = i;
            while (counter < k && j < arr.length) {
                max_so_far += arr[j];
                counter++;
                j++;
            }
            if (max < max_so_far) max = max_so_far;
        }

        return max;
    }
}
