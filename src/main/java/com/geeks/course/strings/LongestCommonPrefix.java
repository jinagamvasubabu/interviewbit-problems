package com.geeks.course.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(lcp(new String[]{"car", "ca", "carlton"}));
    }

    private static String lcp(String[] arr) {

        StringBuilder res = new StringBuilder();
        if (arr.length == 0) return res.toString();

        if (arr.length == 1) return arr[0];


        Arrays.sort(arr);

        String str1 = arr[0];
        String str2 = arr[arr.length-1];

        int min = Math.min(arr[0].length(), arr[arr.length-1].length());

        for(int i=0; i<min; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (c1 == c2) res.append(c1);
            else return res.toString();
        }

        return res.toString();
    }
}

