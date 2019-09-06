package com.geeks.course.arrays;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.max;

//https://www.interviewbit.com/problems/min-steps-in-infinite-grid/
public class MinStepsInInfiniteGrid {
    public static void main(String[] args) {
        System.out.println(coverPoints(new ArrayList<Integer>(Arrays.asList(4, 8, -7, -5, -13, 9, -7, 8)), new ArrayList<Integer>(Arrays.asList(4, -15, -10, -3, -13, 12, 8, -8))));
    }

    public static int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {

        int j = 0;
        int count = 0;
        while (j + 1 < A.size()) {
            int x = Math.abs(A.get(j) - A.get(j + 1));
            int y = Math.abs(B.get(j) - B.get(j + 1));
            count += max(x, y);
            j++;
        }

        return count;

    }
}
