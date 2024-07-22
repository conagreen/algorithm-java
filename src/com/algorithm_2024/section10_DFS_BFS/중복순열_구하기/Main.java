package com.algorithm_2024.section10_DFS_BFS.중복순열_구하기;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 8-4
 * */
public class Main {
    static int n, limit;
    static int[] answer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        limit = scanner.nextInt();
        answer = new int[limit];
        dfs(0);
    }

    public static void dfs(int level) {
        if (level == limit) {
            for (int i : answer) System.out.print(i + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                answer[level] = i;
                dfs(level + 1);
            }
        }
    }
}
