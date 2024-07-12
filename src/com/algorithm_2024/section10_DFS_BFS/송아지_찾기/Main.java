package com.algorithm_2024.section10_DFS_BFS.송아지_찾기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 7-8
 * */
public class Main {
    static int[] moves = {1, -1, 5};
    static int[] check = new int[10001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingPoint = scanner.nextInt();
        int pointOfArrival = scanner.nextInt();
        System.out.println(bfs(startingPoint, pointOfArrival));
    }

    private static int bfs(int startingPoint, int pointOfArrival) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startingPoint);
        check[startingPoint] = 1;
        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Integer polled = queue.poll();
                for (int move : moves) {
                    int position = polled + move;
                    if (position == pointOfArrival) return level + 1;
                    if (position >= 1 && position <= 10000 && check[position] == 0) {
                        queue.add(position);
                        check[position] = 1;
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
