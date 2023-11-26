package com.algorithm_2021_2022.section7.section7_13;

import java.util.*;

public class Main {
    static int[][] graph;
    static int n, m;
    static int[] check;
    static int[] result;

    private void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        while (!queue.isEmpty()) {
            int curr = queue.remove();
            for (int j = 1; j <= n; j++) {
                if (graph[curr][j] == 1 && check[j] == 0) {
                    queue.add(j);
                    check[j] = 1;
                    result[j] = result[curr] + 1;
                }
            }
        }
    }

    private int[][] makeGraph(Scanner scanner) {
        graph = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            int p1 = scanner.nextInt();
            int p2 = scanner.nextInt();
            graph[p1][p2] = 1;
        }

        return graph;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        graph = main.makeGraph(scanner);

        result = new int[n+1];
        check = new int[n+1];
        check[1] = 1;
        main.BFS(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + result[i]);
        }
    }
}