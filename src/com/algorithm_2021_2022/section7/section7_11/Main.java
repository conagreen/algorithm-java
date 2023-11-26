package com.algorithm_2021_2022.section7.section7_11;

import java.util.Scanner;

public class Main {
    static int[][] graph;
    static int[] check;
    static int count = 0;
    static int V, E;

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        V = scanner.nextInt();
        E = scanner.nextInt();
        graph = m.makeGraph(scanner);

        check = new int[V+1];
        check[1] = 1;
        m.DFS(1);

        System.out.println(count);
    }

    private void DFS(int curr) {
        if (curr == V) count++;
        else {
            for (int i = 1; i <= V; i++) {
                if (graph[curr][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    DFS(i);
                    check[i] = 0;
                }
            }
        }
    }

    private int[][] makeGraph(Scanner scanner) {
        int[][] graph = new int[V+1][V+1];

        for (int i = 0; i < E; i++) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            graph[n1][n2] = 1;
        }

        return graph;
    }
}
