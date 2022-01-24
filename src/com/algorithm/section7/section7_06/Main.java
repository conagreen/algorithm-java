package com.algorithm.section7.section7_06;

import java.util.Scanner;

public class Main {
    int num;
    int[] arr;

    private void DFS(int x) {
        if (x == num+1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= num; i++) {
                if (arr[i] == 1) sb.append(i).append(" ");
            }
            if (sb.length() > 0) System.out.println(sb);
        } else {
            arr[x] = 1;
            DFS(x+1);
            arr[x] = 0;
            DFS(x+1);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        m.num = scanner.nextInt();
        m.arr = new int[m.num+1];
        m.DFS(1);
    }

}
