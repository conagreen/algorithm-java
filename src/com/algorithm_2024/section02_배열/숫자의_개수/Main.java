package com.algorithm_2024.section02_배열.숫자의_개수;

import java.util.Map;
import java.util.Scanner;

/*
 * 백준 - 2577
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() * scanner.nextInt() * scanner.nextInt();
        for (int i : calculateNumberOccurrences(n)) {
            System.out.println(i);
        }
    }

    private static int[] calculateNumberOccurrences(int n) {
        int[] result = new int[10];
        char[] arr = String.valueOf(n).toCharArray();

        for (int i = 0; i < arr.length; i++) {
            result[arr[i] - 48]++;
        }

        return result;
    }
}
