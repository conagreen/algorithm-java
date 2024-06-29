package com.algorithm_2024.section09_정렬.LRU;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 6-4
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        int n = scanner.nextInt();
        int[] cache = new int[capacity];
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            int before = input;
            for (int j = 0; j < capacity; j++) {
                if (cache[j] == input) {
                    cache[j] = before;
                    break;
                }

                if (cache[j] != input) {
                    int temp = cache[j];
                    cache[j] = before;
                    before = temp;
                }
            }
        }

        for (int i : cache) {
            System.out.print(i + " ");
        }
    }
}