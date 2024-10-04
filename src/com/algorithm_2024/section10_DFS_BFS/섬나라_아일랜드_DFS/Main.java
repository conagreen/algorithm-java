package com.algorithm_2024.section10_DFS_BFS.섬나라_아일랜드_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 8-13
 * */
public class Main {
    static int[] rp = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] cp = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] board;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        board = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        int answer = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    dfs(i, j);
                }
            }
        }

        System.out.println(answer);
    }

    private static void dfs(int x, int y) {
        if (board[x][y] == 0) {
            return;
        }

        board[x][y] = 0;

        for (int i = 0; i < 8; i++) {
            int nx = x + rp[i];
            int ny = y + cp[i];
            if (nx < 0 || y + ny < 0 || nx >= board.length || ny >= board.length) {
                continue;
            }
            dfs(nx, ny);
        }
    }
}