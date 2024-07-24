package com.algorithm_2024.section10_DFS_BFS.순열_구하기;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 8-6
 * */
public class Main {
    static int limit;
    static int[] nums;
    static int[] check, answer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        limit = scanner.nextInt();
        answer = new int[limit];
        check = new int[n];
        nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        dfs(0);
    }

    private static void dfs(int level) {
        if (level == limit) {
            for (Integer num : answer) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    answer[level] = nums[i];
                    dfs(level + 1);
                    check[i] = 0;
                }
            }
        }
    }
}