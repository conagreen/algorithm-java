package com.algorithm.section9.section9_05;

import java.util.*;

class Connection implements Comparable<Connection>{
    int vertex;
    int cost;

    public Connection(int destination, int cost) {
        this.vertex = destination;
        this.cost = cost;
    }

    @Override
    public int compareTo(Connection o) {
        return this.cost - o.cost;
    }
}

public class Main {
    int n, m;
    List<List<Connection>> graph = new ArrayList<>();
    int[] distance;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        main.n = scanner.nextInt();
        main.m = scanner.nextInt();
        main.distance = new int[main.n+1];

        for (int i = 0; i <= main.n; i++) {
            main.graph.add(new ArrayList<>());
        }

        for (int i = 0; i < main.m; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            int cost = scanner.nextInt();
            main.graph.get(source).add(new Connection(destination, cost));
        }

        main.solution(1);
        for (int i = 2; i <= main.n; i++) {
            if (main.distance[i] == Integer.MAX_VALUE) System.out.println(i + " : impossible");
            else System.out.println(i + " : " + main.distance[i]);
        }
    }

    private void solution(int v) {
        Queue<Connection> queue = new PriorityQueue<>();
        queue.add(new Connection(v, 0));
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[v] = 0;

        while (!queue.isEmpty()) {
            Connection curr = queue.remove();
            int curVertex = curr.vertex;
            int curCost = curr.cost;

            for (Connection cn : graph.get(curVertex)) {
                if (distance[cn.vertex] > curCost + cn.cost) {
                    distance[cn.vertex] = curCost + cn.cost;
                    queue.add(new Connection(cn.vertex, curCost + cn.cost));
                }
            }
        }
    }
}
