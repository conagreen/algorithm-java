package com.algorithm.section8.section8_03;

import java.util.Scanner;

public class Main {
    static int[][] arr;
    static int n, m;
    static int result;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        main.DFS(0, 0, 0);
        System.out.println(result);
    }

    private void DFS(int lv, int sum, int capacity) {
        if (capacity > m) return;
        if (lv == n) {
            result = Math.max(result, sum);
        } else {
            DFS(lv+1, sum + arr[lv][0], capacity + arr[lv][1]);
            DFS(lv+1, sum, capacity);
        }
    }
}
