package com.algorithm_2021_2022.section9.section9_06;

import java.util.Scanner;

public class Main {
    static int[] parent;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        makeSet(n);

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            main.union(a, b);
        }

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(main.solution(x, y));
    }

    private String solution(int x, int y) {
        int xp = find(x);
        int yp = find(y);
        if (xp == yp) return "YES";
        else return "NO";
    }

    private void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a > b) parent[a] = b;
        else parent[b] = a;
    }

    private int find(int x) {
        if (x == parent[x]) return x;
        else return parent[x] = find(parent[x]);
    }

    private static void makeSet(int n) {
        parent = new int[n+1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
    }
}
