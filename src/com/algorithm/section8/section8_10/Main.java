package com.algorithm.section8.section8_10;

import java.util.Scanner;

public class Main {
    static int[][] maze = new int[7 + 2][7 + 2];
    static int[] rp = {-1, 0, 1, 0};
    static int[] cp = {0, 1, 0, -1};
    int result;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int endOfMaze = maze.length - 1;

        for (int i = 0; i <= endOfMaze; i++) {
            for (int j = 0; j <= endOfMaze; j++) {
                if (i == 0 || i == endOfMaze) maze[i][j] = 1;
                else if (j == 0 || j == endOfMaze) maze[i][j] = 1;
                else maze[i][j] = scanner.nextInt();
            }
        }

        main.DFS(1, 1);
        System.out.println(main.result);
    }

    private void DFS(int row, int col) {
        if (row == 7 && col == 7) result++;
        else {
            if (maze[row][col] == 0) {
                maze[row][col] = 1;
                for (int i = 0; i < 4; i++) {
                    DFS(row + rp[i], col + cp[i]);
                }
                maze[row][col] = 0;
            }
        }
    }
}
