package com.geeks.course.recursion;

import java.math.BigInteger;

public class PowerOfNumbers {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=0; i<N; i++) {
            int n = scanner.nextInt();
            System.out.println(pon(n));

        }*/

        System.out.println(pon(9767));
    }

    public static BigInteger pon(int N) {
        int R = N;
        if (N > 10) R = rev(N);

        return BigInteger.valueOf((long) (Math.pow(N, R)%1000000007));
    }


    public static int rev(int R) {
        String s = "" + R;
        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i));
        }
        return Integer.parseInt(res.toString());
    }
}
