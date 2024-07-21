package com.algorithm_2024.section10_DFS_BFS.최대점수_구하기;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 8-3
 * */
public class Main {
    static int cnt, limit;
    static int[][] array;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cnt = scanner.nextInt();
        limit = scanner.nextInt();
        array = new int[cnt][2];
        for (int i = 0; i < cnt; i++) {
            array[i][0] = scanner.nextInt();
            array[i][1] = scanner.nextInt();
        }
        dfs(0, 0, 0);
        System.out.println(max);
    }

    private static void dfs(int level, int score, int time) {
        if (time > limit) return;
        if (level == cnt) max = Math.max(max, score);
        else {
            dfs(level + 1, score + array[level][0], time + array[level][1]);
            dfs(level + 1, score, time);
        }
    }
}
