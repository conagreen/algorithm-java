package com.algorithm_2024.section10_DFS_BFS.경로_탐색_인접행렬;

import java.util.*;

/*
 * 인프런 - 자바 알고리즘 7-11
 * */
public class Main {
    static int vertex, edge;
    static int[][] graph;
    static int[] check;
    static int answer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        vertex = scanner.nextInt();
        edge = scanner.nextInt();
        graph = new int[vertex + 1][vertex + 1];
        check = new int[vertex + 1];

        for (int i = 0; i < edge; i++) {
            graph[scanner.nextInt()][scanner.nextInt()] = 1;
        }

        check[1] = 1;
        dfs(1);
        System.out.println(answer);
    }

    private static void dfs(int num) {
        if (num == vertex) {
            answer++;
            return;
        }

        for (int i = 1; i <= vertex; i++) {
            if (graph[num][i] == 1 && check[i] == 0) {
                check[i] = 1;
                dfs(i);
                check[i] = 0;
            }
        }
    }
}
