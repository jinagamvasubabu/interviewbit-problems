package com.geeks.course.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PossibleWordsFromDigits {
    private static String[] dict = new String[]{
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] input = new int[n];
            for (int j = 0; j < n; j++) {
                input[j] = scanner.nextInt();
            }
            possibleWords(input);
            System.out.println();
        }


    }

    private static void possibleWords(int[] input) {
        char[] arr = new char[input.length];
        List<String> result = new ArrayList<>();
        printUtil(input, 0, arr, result);
        for (String str : result)
            System.out.print(str + " ");

    }

    private static void printUtil(int[] input, int index, char[] arr, List<String> result) {
        if (index == input.length) {
            result.add(new String(arr));
            return;
        }

        int firstLetterInInput = input[index];
        char[] lettersInIndex = dict[firstLetterInInput].toCharArray();

        for (int i = 0; i < lettersInIndex.length; i++) {
            arr[index] = lettersInIndex[i];
            printUtil(input, index + 1, arr, result);
        }
    }


}
