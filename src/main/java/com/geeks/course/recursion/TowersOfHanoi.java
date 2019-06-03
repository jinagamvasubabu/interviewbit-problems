package com.geeks.course.recursion;

public class TowersOfHanoi {
    public static void main(String[] args) {
        toh(3, 1,3,2,0);
    }

    public static void toh(int N, int from_rod, int to_rod, int aux_rod, int count) {
        if (N == 1) {
            System.out.println("move disk 1 from "+from_rod+" to"+ to_rod);
            ++count;
            return;
        }

        toh(N-1, from_rod, aux_rod, to_rod, ++count);
        System.out.println("Move disk " + N + " from rod " +  from_rod + " to rod " + to_rod);
        toh(N-1, aux_rod, to_rod, from_rod, ++count);

        System.out.println(count+1);

    }
}
