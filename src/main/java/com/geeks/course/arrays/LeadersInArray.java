package com.geeks.course.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 5, 3, 15, 8, 3};
        Stack<Integer> result =  leadersInArray(arr);
        while (!result.isEmpty()) {
            System.out.print(result.pop()+ " ");
        }
    }

    private static Stack<Integer> leadersInArray(int[] arr) {
        int currentMax = 0;
        List<Integer> result = new ArrayList<>();
        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
                result.add(currentMax);
            }
        }

        Stack<Integer> stck = new Stack<>();
        long ele = result.stream()
                .map(stck::push)
                .count();

        return stck;
    }
}
