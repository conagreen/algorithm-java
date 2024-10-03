package com.algorithm_2024.section10_DFS_BFS.토마토;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 8-12
 * */
public class Main {
    static int[] rp = {-1, 0, 1, 0};
    static int[] cp = {0, 1, 0, -1};
    static int column, row;
    static int[][] board, distance;
    static Queue<Point> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        column = scanner.nextInt();
        row = scanner.nextInt();
        board = new int[row][column];
        distance = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                board[i][j] = scanner.nextInt();
                if (board[i][j] == 1) {
                    queue.offer(new Point(i, j));
                }
            }
        }
        System.out.println(bfs());
    }

    private static int bfs() {
        while (!queue.isEmpty()) {
            Point currentPoint = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextRow = currentPoint.x + rp[i];
                int nexColumn = currentPoint.y + cp[i];
                if (nextRow >= 0 && nexColumn >= 0 && nextRow < row && nexColumn < column && board[nextRow][nexColumn] == 0) {
                    board[nextRow][nexColumn] = 1;
                    distance[nextRow][nexColumn] = distance[currentPoint.x][currentPoint.y] + 1;
                    queue.offer(new Point(nextRow, nexColumn));
                }
            }
        }
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (board[i][j] == 0) {
                    return -1;
                }
                answer = Math.max(answer, distance[i][j]);
            }
        }
        return answer;
    }
}

class Point {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}