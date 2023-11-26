package com.algorithm_2021_2022.section8.section8_01;

import java.util.*;

public class Main {
    int num;
    int total;
    boolean flag = false;
    String result = "NO";

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);

        m.num = scanner.nextInt();
        int[] arr = new int[m.num];

        for (int i = 0; i < m.num; i++) {
            arr[i] = scanner.nextInt();
            m.total += arr[i];
        }

        m.DFS(0, 0, arr);
        System.out.println(m.result);
    }

    private void DFS(int x, int sum, int[] arr) {
        if (flag) return;
        if (sum > total/2) return;

        if (x == num) {
            if (total - sum == sum) {
                result = "YES";
                flag = true;
            }
        } else {
            DFS(x+1, sum+arr[x], arr);
            DFS(x+1, sum, arr);
        }
    }
}
