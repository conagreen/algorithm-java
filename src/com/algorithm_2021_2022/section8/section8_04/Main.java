package com.algorithm_2021_2022.section8.section8_04;

import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] pm;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        pm = new int[m];

        main.DFS(0);
    }

    private void DFS(int L) {
        if (L == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }
}

