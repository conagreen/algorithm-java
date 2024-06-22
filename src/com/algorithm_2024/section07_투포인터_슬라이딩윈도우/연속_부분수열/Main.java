package com.algorithm_2024.section07_투포인터_슬라이딩윈도우.연속_부분수열;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 3-4
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int lt = 0, rt = 0;
        int answer = 0;
        int sum = arr[0];
        while (rt < n) {
            if (sum == target) {
                answer++;
                if (++rt == n) continue;
                sum += (arr[rt] - arr[lt]);
                lt++;
                continue;
            }
            if (sum > target && lt < rt) {
                sum -= arr[lt++];
                continue;
            }

            if (++rt == n) continue;
            sum += arr[rt];
        }
        System.out.print(answer);
    }
}

