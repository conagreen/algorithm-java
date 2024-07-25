package com.algorithm_2024.section10_DFS_BFS.조합의_경우수;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 8-7
 * */
public class Main {
    static int[][] memory;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        memory = new int[n + 1][n + r];
        System.out.println(dfs(n, r));
    }

    private static int dfs(int n, int r) {
        if (memory[n][r] > 0) return memory[n][r];
        else if (n == r || r == 0) return memory[n][r] = 1;
        else return memory[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
    }
}
