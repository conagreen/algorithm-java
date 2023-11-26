package com.algorithm_2021_2022.section8.section8_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Coordinate {
    int low;
    int col;

    public Coordinate(int low, int col) {
        this.low = low;
        this.col = col;
    }
}

public class Main {
    static int[][] maze = new int[7+2][7+2];
    static int[] lp = {-1, 0, 1, 0};
    static int[] cp = {0, 1, 0, -1};

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int endOfMaze = maze.length - 1;

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                if (i == 0 || i == endOfMaze || j == 0 || j == endOfMaze) maze[i][j] = 1;
                else maze[i][j] = scanner.nextInt();
            }
        }

        System.out.println(main.BFS(1, 1));
    }

    private int BFS(int low, int col) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(low, col));
        maze[low][col] = 1;
        int result = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Coordinate curr = queue.remove();
                for (int j = 0; j < 4; j++) {
                    int cl = curr.low + lp[j];
                    int cc = curr.col + cp[j];
                    if (maze[cl][cc] == 0) {
                        if (cl == 7 && cc == 7) return result+1;
                        maze[cl][cc] = 1;
                        queue.add(new Coordinate(cl, cc));
                    }
                }
            }
            result++;
        }
        return -1;
    }
}
