package com.geeks.course.strings;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("vasu", "asuv"));
    }

    private static boolean isAnagram(String str1, String str2) {
        int count[] = new int[256];

        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            count[str2.charAt(i)]--;
        }

        for (int aCount : count) {
            if (aCount != 0) return false;
        }

        return true;
    }
}
