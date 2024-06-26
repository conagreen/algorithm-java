package com.algorithm_2024.section09_정렬.삽입정렬;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 6-3
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            for (int j = i - 1; j >= 0 ; j--) {
                if (current < arr[j]) {
                    arr[j + 1] = arr[j];
                    arr[j] = current;
                } else {
                    break;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}