package com.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class AddOneToNumber {
    public static void main(String[] args) {
        System.out.println(plusOne(new ArrayList<Integer>(Arrays.asList(0, 0, 3, 7, 6, 4, 0, 5, 5, 5))));
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry = 0;
        for (int i = A.size() - 1; i >= 0; i--) {
            if (i == A.size() - 1) {
                carry = (A.get(i) + 1) / 10;
                int toAdd = (A.get(i) + 1) % 10;
                A.set(i, toAdd);
            } else {
                if (carry == 0 && A.get(i) == 0) {
                    A.set(i, -1);
                } else {
                    int toAdd = (A.get(i) + carry) % 10;
                    carry = (A.get(i) + carry) / 10;
                    A.set(i, toAdd);
                }
            }
        }

        if (carry > 0) {
            LinkedList<Integer> queue = new LinkedList<Integer>(A);
            queue.addFirst(carry);
            return new ArrayList<Integer>(queue);
        }

        if (A.get(0) == -1) {
            int i = 0;
            while (i < A.size()) {
                if (A.get(i) == -1) {
                    A.remove(i);
                    i = 0;
                } else {
                    break;
                }
            }
        }

        int i = 0;
        while (i < A.size()) {
            if (A.get(i) == -1) {
                A.set(i, 0);
            }
            i++;
        }

        return A;

    }
}
