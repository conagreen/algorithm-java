package com.algorithm.section8.section8_09;

import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] result;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        result = new int[m];

        main.DFS(0, 1);
    }

    private void DFS(int L, int V) {
        if (L == m) {
            for (int x : result) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = V; i <= n; i++) {
                result[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
}
