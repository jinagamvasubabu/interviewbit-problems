package com.geeks.course.math;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(countDigitsInFact(scanner.nextInt()));
        }
    }

    public static long fact(int N) {
        if (N == 0) return 1;
        return N * fact(N - 1);
    }

    public static int countDigitsInFact(int N) {
        long result = fact(N);
        System.out.println(result);
        return countDigits(result);
    }

    public static int countDigits(long N) {
        if (N == 0) return 0;
        return 1 + countDigits(N / 10);
    }
}
