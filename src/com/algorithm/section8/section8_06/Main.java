package com.algorithm.section8.section8_06;

import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] arr;
    static int[] result;
    static int[] check;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        result = new int[m];
        check = new int[n];
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        main.DFS(0);
    }

    private void DFS(int L) {
        if (L == m) {
            for (int x : result) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    result[L] = arr[i];
                    DFS(L+1);
                    check[i] = 0;
                }
            }
        }
    }
}
