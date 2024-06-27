package com.algorithm_2024.section09_정렬.중복확인;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 6-5
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(solution(arr));

    }

    private static String solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) return "D";
        }
        return "U";
    }
}