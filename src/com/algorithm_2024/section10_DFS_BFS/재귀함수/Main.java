package com.algorithm_2024.section10_DFS_BFS.재귀함수;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 7-1
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        recursive(n);
    }

    private static void recursive(int n) {
        if (n < 1) return;
        recursive(n - 1);
        System.out.print(n + " ");
    }
}
