package com.algorithm_2024.section07_투포인터_슬라이딩윈도우.두_배열_합치기;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* 인프런 - 자바 알고리즘 3-1
* */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }

        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (arr1[p1] <= arr2[p2]) {
                answer.add(arr1[p1++]);
                continue;
            }
            answer.add(arr2[p2++]);
        }

        while (p1 < n) answer.add(arr1[p1++]);
        while (p2 < m) answer.add(arr2[p2++]);

        for (int a : answer) {
            System.out.print(a + " ");
        }
    }
}