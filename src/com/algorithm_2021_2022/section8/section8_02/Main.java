package com.algorithm_2021_2022.section8.section8_02;

import java.util.Scanner;

public class Main {
    static int capacity;
    static int num;
    static int[] weight;
    static int max;

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);

        capacity = scanner.nextInt();
        num = scanner.nextInt();
        weight = new int[num];

        for (int i = 0; i < num; i++) {
            weight[i] = scanner.nextInt();
        }

        m.DFS(0, 0);
        System.out.println(max);
    }

    private void DFS(int lv, int sum) {
        if (sum > capacity) return;
        if (lv == num) {
            max = Math.max(max, sum);
        } else {
            DFS(lv+1, sum + weight[lv]);
            DFS(lv+1, sum);
        }
    }
}