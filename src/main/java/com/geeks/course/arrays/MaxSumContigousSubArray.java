package com.geeks.course.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.interviewbit.com/problems/max-sum-contiguous-subarray/
public class MaxSumContigousSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new ArrayList<Integer>(Arrays.asList(-2, -3, 4, -1, -2, 1, 5, -3))));
    }

    public static int maxSubArray(final List<Integer> A) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < A.size(); i++)
        {
            max_ending_here = max_ending_here + A.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
