package com.algorithm_2024.section10_DFS_BFS.합이_같은_부분집합;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 8-1
 * */
public class Main {
    static String answer = "NO";
    static double target;
    static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        arr = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }

        target = (double) total / 2;
        dfs(0, 0);
        System.out.println(answer);
    }

    private static void dfs(int level, int sum) {
        if (answer.equals("YES")) return;
        if (sum > target) return;
        if (level == arr.length) {
            if (sum == target) answer = "YES";
        } else {
            sum += arr[level];
            dfs(level + 1, sum);
            sum -= arr[level];
            dfs(level + 1, sum);
        }
    }
}