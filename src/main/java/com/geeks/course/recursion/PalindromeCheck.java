package com.geeks.course.recursion;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome("max"));
    }

    public static String isPalindrome(String str) {

        if (str.length() == 1)
            return "Yes";

        if (str.charAt(0) == str.charAt(str.length()-1))
            return isPalindrome(str.substring(1, str.length()-1));

        return "No";
    }
}
