package com.geeks.course.recursion;

import java.util.Scanner;

public class GameOfDeath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=0; i<N; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(god(n,k));

        }
    }

    public static int god(int N, int K) {
        if (N == 1) return 1;

        return (god(N - 1, K) + K-1) % N + 1;
    }
}
