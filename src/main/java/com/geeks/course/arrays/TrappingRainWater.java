package com.geeks.course.arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(trappingRainWater(new int[]{3,0,1,2,5}));
    }


    public static int trappingRainWater(int[] arr) {
        if (arr.length == 0 || arr.length == 1) return 0;

        int max = Integer.MIN_VALUE;
        int max_index  = 0;
        int min_max = Integer.MIN_VALUE;

        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max < arr[i]) {
                max = arr[i];
                max_index = i;
            } // 5
        }

        for (int i=0; i<arr.length; i++) {
            if (min_max < arr[i] && i != max_index) {
                min_max = arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max)
            count += min_max-arr[i];
        }
        return count;

    }
}
