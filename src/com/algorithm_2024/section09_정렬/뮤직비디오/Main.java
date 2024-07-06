package com.algorithm_2024.section09_정렬.뮤직비디오;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 6-9
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        int answer = 0;

        while (lt <= rt) {
            int sum = 0, cnt = 1;
            int mid = (lt + rt) / 2;
            for (int x : arr) {
                if (sum + x <= mid) {
                    sum += x;
                } else {
                    sum = x;
                    cnt++;
                }
            }

            if (cnt <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        System.out.println(answer);
    }
}