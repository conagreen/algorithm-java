package com.algorithm.section9.section9_07;

import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    int v1;
    int v2;
    int cost;

    public Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Main {
    int[] distance;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        main.makeSet(n);
        Edge[] graph = new Edge[m];

        for (int i = 0; i < m; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            int cost = scanner.nextInt();
            graph[i] = new Edge(v1, v2, cost);
        }

        Arrays.sort(graph);
        System.out.println(main.solution(m, graph));
    }

    private int solution(int m, Edge[] graph) {
        int total = 0;
        for (int i = 0; i < m; i++) {
            if (union(graph[i].v1, graph[i].v2)) total += graph[i].cost;
        }
        return total;
    }

    private boolean union(int v1, int v2) {
        v1 = find(v1);
        v2 = find(v2);
        if (v1 != v2) {
            if (v1 > v2) distance[v1] = v2;
            else distance[v2] = v1;
            return true;
        }
        return false;
    }

    private int find(int x) {
        if (distance[x] == x) return x;
        else return distance[x] = find(distance[x]);
    }

    private void makeSet(int n) {
        distance = new int[n+1];
        for (int i = 0; i <= n; i++) {
            distance[i] = i;
        }
    }
}
