package com.algorithm_2024.section10_DFS_BFS.경로_탐색_인접리스트;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 7-12
 * */
public class Main {
    static int vertex, edge, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        vertex = scanner.nextInt();
        edge = scanner.nextInt();
        check = new int[vertex + 1];
        graph = new ArrayList<>();
        
        for (int i = 0; i <= vertex; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            final int from = scanner.nextInt();
            final int to = scanner.nextInt();
            graph.get(from).add(to);
        }

        check[1] = 1;
        dfs(1);
        System.out.println(answer);
    }

    private static void dfs(int from) {
        if (from == vertex) {
            answer++;
            return;
        }

        for (int to : graph.get(from)) {
            if (check[to] == 0) {
                check[to] = 1;
                dfs(to);
                check[to] = 0;
            }
        }
    }
}