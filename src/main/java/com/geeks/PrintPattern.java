package com.geeks;

//https://practice.geeksforgeeks.org/problems/print-the-pattern-set-1/1
public class PrintPattern {
    public static void main(String[] args) {
        printPattern(1);
      //  product(new int[]{887,2778,6916}, 3, );
    }

    public static void printPattern(int N) {
        if (N == 0) System.out.println("$");

        int k = N;
        while (k > 0) {
            int j = k;
            for (int i = N; i > 0; i--) {
                while (j > 0) {
                    System.out.print(i);
                    System.out.print(" ");
                    j--;
                }
                j = k;
            }
            k--;
            System.out.print("$");
        }

    }



}
