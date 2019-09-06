package com.geeks.course.matrix;

public class RotateBy90 {
    public static void main(String[] args) {
        int[][] m = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        rotate(m);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println("");
        }

    }

    private static void rotate(int[][] m) {
        //transpose
        // reverse of each and every column gives 90 degree counter clockwise shift
        transpose(m);
    }

    private static void transpose(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = i+1; j < m[i].length; j++) {
                swap(m, i, j);
            }
        }

    }

    private static void reverse(int[][] m) {

    }

    private static void swap(int[][] m, int i, int j) {
        int temp = m[i][j];
        m[i][j] = m[j][i];
        m[j][i] = temp;
    }
}
