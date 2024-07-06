package com.algorithm_2024.section10_DFS_BFS.팩토리얼;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 7-3
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(recursive(n));
    }

    private static int recursive(int n) {
        if (n == 1) return 1;
        return n * recursive(n - 1);
    }
}