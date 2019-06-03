package com.geeks.course.recursion;

public class FindEleInArray {
    public static void main(String[] args) {
        System.out.println(searchElement(new int[]{1,2,3,4}, 0, 5));
    }

    public static boolean searchElement(int[] arr, int startIndex, int target) {
        if (startIndex+1 > arr.length)
            return false;
        if (arr[startIndex] ==  target) {
            return true;
        }

        return searchElement(arr, startIndex+1, target);
    }
}
