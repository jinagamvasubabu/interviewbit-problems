package com.geeks.course.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//https://www.interviewbit.com/problems/maximum-absolute-difference/
public class MaximumAbsDifference {
    public static void main(String[] args) {
       // System.out.println(maxArr(new ArrayList<Integer>(Arrays.asList(1, 3, -1))));
    }

    public int maxArr(ArrayList<Integer> A) {
        return 1;
    }

    public static int calculate(int i, int j, ArrayList<Integer> A) {
        return Math.abs(A.get(i) - A.get(j)) + Math.abs(i - j);
    }


}
