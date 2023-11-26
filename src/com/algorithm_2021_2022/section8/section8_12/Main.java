package com.algorithm_2021_2022.section8.section8_12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int low;
    int col;

    public Point(int low, int col) {
        this.low = low;
        this.col = col;
    }
}

public class Main {
    static int n, m;
    static int[][] board;
    static int[] lp = {-1, 0, 1, 0};
    static int[] cp = {0, 1, 0, -1};
    static Queue<Point> queue = new LinkedList<>();

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        m = scanner.nextInt();
        n = scanner.nextInt();
        board = new int[n+2][m+2];

        int EN = n+1;
        int EM = m+1;
        for (int i = 0; i <= EN; i++) {
            for (int j = 0; j <= EM; j++) {
                if (i == 0 || i == EN || j == 0 || j == EM) board[i][j] = 1;
                else {
                    board[i][j] = scanner.nextInt();
                    if (board[i][j] == 1) queue.add(new Point(i, j));
                }
            }
        }

        System.out.println(main.BFS());
    }

    private int BFS() {
        int count = -1;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Point temp = queue.remove();
                for (int j = 0; j < 4; j++) {
                    int curLow = temp.low + lp[j];
                    int curCol = temp.col + cp[j];
                    if (board[curLow][curCol] == 0) {
                        board[curLow][curCol] = 1;
                        queue.add(new Point(curLow, curCol));
                    }
                }
            }
            count++;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (board[i][j] == 0) return -1;
            }
        }

        return count;
    }
}
