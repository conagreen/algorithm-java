package com.algorithm_2024.section10_DFS_BFS.바둑이_승차;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 8-2
 * */
public class Main {
    static int limit, cnt;
    static int max;
    static int[] weights;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        limit = scanner.nextInt();
        cnt = scanner.nextInt();
        weights = new int[cnt];
        for (int i = 0; i < cnt; i++) weights[i] = scanner.nextInt();

        dfs(0, 0);
        System.out.println(max);
    }

    private static void dfs(int level, int total) {
        if (level == cnt) {
            if (total <= limit && total > max) max = total;
        } else {
            dfs(level + 1, total + weights[level]);
            dfs(level + 1, total);
        }
    }
}
