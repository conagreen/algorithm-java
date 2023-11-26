package com.algorithm_2021_2022.section7.section7_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<ArrayList<Integer>> graph;
    static int count = 0;
    static int n, m;
    static int[] check;

    private void DFS(int v) {
        if (v == n) count++;
        else {
            for (Integer x : graph.get(v)) {
                if (check[x] == 0) {
                    check[x] = 1;
                    DFS(x);
                    check[x] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        check = new int[n + 1];

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            graph.get(v1).add(v2);
        }

        check[1] = 1;
        main.DFS(1);
        System.out.println(count);
    }
}
