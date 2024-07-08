package com.algorithm_2024.section10_DFS_BFS.피보나치_수열;

import java.io.IOException;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 7-4
 * */
public class Main {
    static int[] memory;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        memory = new int[n + 1];
        for (int i = 1; i <= n; i++) System.out.print(recursive(i) + " ");
    }

    private static int recursive(int n) {
        if (memory[n] != 0) return memory[n];
        else if (n == 1) return memory[n] = 1;
        else if (n == 2) return memory[n] = 1;
        return memory[n] = recursive(n - 2) + recursive(n - 1);
    }
}