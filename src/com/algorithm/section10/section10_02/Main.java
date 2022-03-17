package com.algorithm.section10.section10_02;

import java.util.Scanner;

public class Main {
    int[] dy;
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        main.dy = new int[n+2];

        System.out.println(main.solution(n+1));
    }

    private int solution(int n) {
        if (dy[n] > 0) return dy[n];
        else if (n == 1) return 1;
        else if (n == 2) return 2;
        else return dy[n] = solution(n-2) + solution(n-1);
    }
}
