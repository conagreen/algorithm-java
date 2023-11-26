package com.algorithm_2021_2022.section8.section8_13;

import java.util.Scanner;

public class Main {
    static int n, result;
    static int[][] board;
    int[] lp = {-1, -1, 0, 1, 1, 1, 0, -1};
    int[] cp = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        board = new int[n+2][n+2];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        main.solution();
        System.out.println(result);
    }

    private void solution() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (board[i][j] == 1) {
                    result++;
                    board[i][j] = 0;
                    DFS(i, j);
                }
            }
        }
    }

    private void DFS(int low, int col) {
        for (int i = 0; i < 8; i++) {
            int curLow = low + lp[i];
            int curCol = col + cp[i];
            if (board[curLow][curCol] == 1) {
                board[curLow][curCol] = 0;
                DFS(curLow, curCol);
            }
        }
    }
}
