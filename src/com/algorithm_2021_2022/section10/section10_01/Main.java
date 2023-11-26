package com.algorithm_2021_2022.section10.section10_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(main.solution(n));
    }

    private int solution(int n) {
        int[] dy = new int[n+1];
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n];
    }
}
