package com.algorithm_2021_2022.section10.section10_05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, target;
    static Integer[] arr;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        target = scanner.nextInt();
        System.out.println(main.solution());
    }

    private int solution() {
        int[] dp = new int[target+1];
        Arrays.fill(dp, 2_000_000_000);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= target; j++) {
                dp[j] = Math.min(dp[j], dp[j - arr[i]]+1);
            }
        }

        return dp[target];
    }
}