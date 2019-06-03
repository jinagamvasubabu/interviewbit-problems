package com.geeks.course.math;

public class PrintCountOfDigits {
    public static void main(String[] args) {
        System.out.println(count(32432423));
        System.out.println(countRec(32432423));
    }

    public static int count(int N) {
        int count = 0;
        while(N > 0) {
            N = N/10;
            ++ count;
        }
        return count;
    }


    public static int countRec(int N) {
        if ( N == 0) return 0;
        return 1+ countRec(N/10);
    }
}
