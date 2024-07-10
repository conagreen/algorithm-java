package com.algorithm_2024.section10_DFS_BFS.부분집합_구하기;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 7-7
 * */
public class Main {
    static int num;
    static int[] check;

    public static void recursive(int level) {
        if (level == num + 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= num; i++) {
                if (check[i] == 1) sb.append(i).append(" ");
            }
            if (sb.length() > 0) System.out.println(sb);
        } else {
            check[level] = 1;
            recursive(level + 1);
            check[level] = 0;
            recursive(level + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        check = new int[num + 1];
        recursive(1);
    }
}
