package com.algorithm_2024.section07_투포인터_슬라이딩윈도우.최대_매출;

import java.io.IOException;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 3-3
 * */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = 0;
        for (int i = 0; i < m; i++) {
            max += arr[i];
        }

        int sum = max;
        for (int i = m; i < n; i++) {
            sum = sum - arr[i - m] + arr[i];
            max = Math.max(max, sum);
        }

        System.out.print(max);
    }
}
