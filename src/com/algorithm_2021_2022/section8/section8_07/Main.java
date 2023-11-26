package com.algorithm_2021_2022.section8.section8_07;

import java.util.Scanner;

public class Main {
    static int[][] check;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int r = scanner.nextInt();
        check = new int[n+1][n+1];

        System.out.println(main.DFS(n, r));
    }

    private int DFS(int n, int r) {
        if (check[n][r] > 0) return check[n][r];
        if (r == 0 || n == r) return 1;
        else return check[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }
}
