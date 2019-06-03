package com.geeks.course.recursion;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=0; i<N; i++) {
            SortedSet<String> result = new TreeSet<>();
            String s = scanner.next();
            permutation("",s, result);

            // Displaying the Tree set data
            for (String aResult : result) System.out.print(aResult + " ");
            System.out.println();
        }
    }

    public static void permutation(String prefix, String str, SortedSet<String> result) {
        if (str.length() == 0) result.add(prefix);
        else{
            for (int i = 0; i  < str.length(); i++) {
                permutation(prefix+str.charAt(i), str.substring(0, i) + str.substring(i+1), result);
            }
        }
    }
}
