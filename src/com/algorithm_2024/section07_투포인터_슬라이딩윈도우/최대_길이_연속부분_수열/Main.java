package com.algorithm_2024.section07_투포인터_슬라이딩윈도우.최대_길이_연속부분_수열;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 3-6
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int cnt = 0, lt = 0, answer = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > k) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        System.out.print(answer);
    }
}