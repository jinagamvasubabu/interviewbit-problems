package com.geeks.course.matrix;

public class SnakeTraversal {
    public static void main(String[] args) {
        int[][] m = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        print(m);
    }

    static void print(int[][] m) {
        boolean flag = true; // straight, vicerversa
        int count;
        for (int i = 0; i < m.length; i++) {
            if (flag) {
                count = 0;
                while (count < m.length) {
                    System.out.print(m[i][count]+" ");
                    count++;
                }
            } else {
                count = m.length-1;
                while (count >= 0) {
                    System.out.print(m[i][count]+" ");
                    count--;
                }
            }
            flag = !flag;
        }
    }
}
