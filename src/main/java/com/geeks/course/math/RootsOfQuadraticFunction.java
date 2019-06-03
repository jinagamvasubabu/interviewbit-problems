package com.geeks.course.math;


import java.util.Scanner;

public class RootsOfQuadraticFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            printRoots(a, b, c);
        }
    }

    public static void printRoots(int a, int b, int c) {
        if (a == 0)
            System.out.println("Invalid");
        int d = (b * b) - (4 * a * c);
        if (d < 0) {
            System.out.println("imaginary");
        } else {
            int x = (int) (((-b + Math.sqrt((b * b) - 4 * a * c))) / (2 * a));
            int y = (int) (((-b - Math.sqrt((b * b) - 4 * a * c))) / (2 * a));

            if (x > y)
                System.out.println((int) Math.floor(x) + " " + (int) Math.floor(y));
            else
                System.out.println((int) Math.floor(y) + " " + (int) Math.floor(x));
        }


    }
}
