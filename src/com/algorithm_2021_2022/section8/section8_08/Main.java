package com.algorithm_2021_2022.section8.section8_08;

import java.util.Scanner;

public class Main {
    private static int n, f;
    private static int[] check, pm, combinationArrays;
    private static boolean flag = false;
    private static int[][] cb;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        f = scanner.nextInt();
        check = new int[n + 1];
        pm = new int[n];
        cb = new int[n + 1][n + 1];
        combinationArrays = main.getCombinationArrays();

        main.DFS(0, 0);
        for (int x : pm) {
            System.out.print(x + " ");
        }
    }

    private void DFS(int L, int sum) {
        if (flag) return;
        if (L == n) if (sum == f) flag = true;
        else {
            for (int i = 1; i <= n; i++) {
                if (flag) return;
                else if (check[i] == 0) {
                    check[i] = 1;
                    pm[L] = i;
                    DFS(L + 1, sum + pm[L] * combinationArrays[L]);
                    check[i] = 0;
                }
            }
        }
    }

    private int[] getCombinationArrays() {
        int[] combinationArrays = new int[n];
        for (int i = 0; i < n; i++) combinationArrays[i] = getCombination(n - 1, i);

        return combinationArrays;
    }

    private int getCombination(int n, int r) {
        if (cb[n][r] > 0) return cb[n][r];
        if (n == r || r == 0) return 1;
        else return cb[n][r] = getCombination(n - 1, r - 1) + getCombination(n - 1, r);
    }
}
