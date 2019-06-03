package com.geeks.course.recursion;

import static java.lang.Math.max;

/**
 * i/p n=23 denomination = {9,11,12}
 * op = 2 // 11+12
 * <p>
 * i/p n=5 denomination = {2,6,4}
 * o/p = -1 // we cannot make it to pieces using above denomination
 */

public class RopePieces {
    public static void main(String[] args) {
        System.out.println(maxPieces(23, new int[]{9, 11, 12}));
    }

    public static int maxPieces(int N, int[] arr) {
        if (N < 0) return -1;

        if (N == 0) return 0;

        int ca = maxPieces(N - arr[0], arr);
        int cb = maxPieces(N - arr[1], arr);
        int cc = maxPieces(N - arr[2], arr);


        int res = max(max(ca, cb), cc);

        if (res == -1) return -1;
        return res + 1;
    }

}
