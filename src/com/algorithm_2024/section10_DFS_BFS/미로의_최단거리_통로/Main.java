package com.algorithm_2024.section10_DFS_BFS.미로의_최단거리_통로;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 8-11
 * */
public class Main {
    static int[][] board = new int[7][7];
    static int[] column = {0, 1, 0, -1};
    static int[] row = {-1, 0, 1, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        System.out.println(bfs(0, 0));
    }

    private static int bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = point.x + row[i];
                int ny = point.y + column[i];
                if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && board[nx][ny] == 0) {
                    board[nx][ny] = board[point.x][point.y] + 1;
                    if (nx == 6 && ny == 6) return board[nx][ny];
                    else queue.add(new Point(nx, ny));
                }
            }
        }
        return -1;
    }
}

class Point {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

