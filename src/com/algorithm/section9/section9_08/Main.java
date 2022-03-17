package com.algorithm.section9.section9_08;

import java.util.*;

class Edge implements Comparable<Edge> {
    int vertex;
    int cost;

    public Edge(int vertex, int cost) {
        this.vertex = vertex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Main {
    int n, m;
    List<List<Edge>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        main.n = scanner.nextInt();
        main.m = scanner.nextInt();

        for (int i = 0; i <= main.n; i++) {
            main.graph.add(new ArrayList<>());
        }

        for (int i = 0; i < main.m; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            int cost = scanner.nextInt();
            main.graph.get(v1).add(new Edge(v2, cost));
            main.graph.get(v2).add(new Edge(v1, cost));
        }

        System.out.println(main.solution());
    }

    private int solution() {
        Queue<Edge> queue = new PriorityQueue<>();
        int[] check = new int[n+1];
        int total = 0;
        queue.add(new Edge(1, 0));

        while (!queue.isEmpty()) {
            final Edge temp = queue.remove();
            final int curVtx = temp.vertex;
            if (check[curVtx] == 0) {
                total += temp.cost;
                check[curVtx] = 1;
                for (Edge edge : graph.get(curVtx)) {
                    if (check[edge.vertex] == 0) queue.add(edge);
                }
            }
        }

        return total;
    }
}