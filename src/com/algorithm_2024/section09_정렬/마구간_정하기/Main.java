package com.algorithm_2024.section09_정렬.마구간_정하기;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 6-10
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int horseCnt = scanner.nextInt();
        int[] positions = new int[n];
        for (int i = 0; i < n; i++) positions[i] = scanner.nextInt();
        Arrays.sort(positions);

        int lt = 1, rt = positions[n - 1];
        int answer = 0;

        while (lt <= rt) {
            int cnt = 1;
            int mid = (lt + rt) / 2;
            int temp = positions[0];
            for (int i = 1; i < n; i++) {
                if (positions[i] - temp >= mid) {
                    cnt++;
                    temp = positions[i];
                }
            }

            if (cnt >= horseCnt) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        System.out.println(answer);
    }
}