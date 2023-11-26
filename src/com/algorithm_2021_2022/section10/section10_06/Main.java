package com.algorithm_2021_2022.section10.section10_06;

import java.util.Scanner;

class Problem {
    int point;
    int time;

    public Problem(int point, int time) {
        this.point = point;
        this.time = time;
    }
}

public class Main {
    static int n, m;
    static Problem[] problems;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        problems = new Problem[n];
        for (int i = 0; i < n; i++) {
            int point = scanner.nextInt();
            int time = scanner.nextInt();
            problems[i] = new Problem(point, time);
        }

        System.out.println(main.solution());
    }

    private int solution() {
        int[] dp = new int[m+1];
        for (int i = 0; i < n; i++) {
            int limit = problems[i].time;
            int point = problems[i].point;
            for (int j = m; j >= limit; j--) {
                dp[j] = Math.max(dp[j], dp[j - limit] + point);
            }
        }
        return dp[m];
    }
}
