package com.geeks.course.math;

public class PrimeCheck {
    public static void main(String[] args) {
        //primeCheck(57);

        int[] A = new int[1000];

        for (int i=0; i<1000; i++) {
            A[i] = i+1;
        }
        System.out.println(div(A));
    }

    public static void primeCheck(int N) {
        int count = 0;
        for (int i = 1; i < N / 2; i++) {
            if (N % i == 0) {
                count++;
            }
        }

        if (count > 1)
            System.out.println("NON PRIME");
        else
            System.out.println("PRIME");
    }


    public static int div(int[] A) {
        int count  = 0;
        for (int i: A) {
            if (i %3 == 0 && i%5 == 0) {
                ++ count;
            } else if (i %3 == 0) {
                ++ count;
            } else if (i%5 == 0) {
                ++ count;
            }
        }
        return count;
    }
}
