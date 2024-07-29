package com.algorithm_2024.section10_DFS_BFS.조합_구하기;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 8-9
 * */
public class Main {
    static int n, limit;
    static int[] answer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        limit = scanner.nextInt();
        answer = new int[limit];
        dfs(1, 0);
    }

    private static void dfs(int from, int level) {
        if (level == limit) {
            for (int x : answer) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = from; i <= n; i++) {
                answer[level] = i;
                dfs(i + 1, level + 1);
            }
        }
    }
}
