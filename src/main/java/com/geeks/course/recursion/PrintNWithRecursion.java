package com.geeks.course.recursion;

public class PrintNWithRecursion {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int N) {
        if (N == 0) return;
        print(N - 1);
        System.out.print(N);
    }

}
