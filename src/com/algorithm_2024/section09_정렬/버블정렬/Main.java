package com.algorithm_2024.section09_정렬.버블정렬;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 6-2
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

