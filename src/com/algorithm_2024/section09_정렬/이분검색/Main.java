package com.algorithm_2024.section09_정렬.이분검색;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 6-8
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        Arrays.sort(arr);

        int lt = 0, rt = n - 1;
        int answer = -1;
        while (lt <= rt) {
            int mid = (rt + lt) / 2;
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }

            if (arr[mid] > m) rt = mid - 1;
            if (arr[mid] < m) lt = mid + 1;
        }

        System.out.println(answer);
    }
}
