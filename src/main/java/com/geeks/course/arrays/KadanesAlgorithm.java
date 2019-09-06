package com.geeks.course.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KadanesAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            String line = br.readLine();
            int arr[] = new int[N];
            String[] strs = line.trim().split("\\s+");

            // array elements input
            for (int j = 0; j < N; j++)
                arr[j] = Integer.parseInt(strs[j]);

            System.out.println(maxSum(arr));
        }
    }

    private static int maxSum(int[] arr) {
        int sum = 0, max_sum = Integer.MIN_VALUE;
        for (int anArr : arr) {
            sum = Math.max(anArr, sum + anArr);
            max_sum = Math.max(sum, max_sum);
        }
        return max_sum;
    }
}
