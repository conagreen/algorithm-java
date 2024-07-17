package com.algorithm_2024.section10_DFS_BFS.그래프_최단거리;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 7-13
 * */
class Main {
    static int vertex, edge, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check, distance;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        vertex = scanner.nextInt();
        edge = scanner.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        check = new int[vertex + 1];
        distance = new int[vertex + 1];

        for (int i = 0; i <= vertex; i++) graph.add(new ArrayList<Integer>());
        for (int i = 0; i < edge; i++) graph.get(scanner.nextInt()).add(scanner.nextInt());

        bfs(1);

        for (int i = 2; i <= vertex; i++) System.out.println(i + " : " + distance[i]);
    }

    public static void bfs(int from) {
        check[from] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(from);
        while (!queue.isEmpty()) {
            int polled = queue.poll();
            for (int to : graph.get(polled)) {
                if (check[to] == 0) {
                    check[to] = 1;
                    queue.offer(to);
                    distance[to] = distance[polled] + 1;
                }
            }
        }
    }
}

/*
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
* */