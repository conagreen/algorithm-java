package com.algorithm.level_01.피보나치_수_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] fibo;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo = new int[n+1];
        int result = recursive(n);
        System.out.println(result);
    }

    private static int recursive(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else if (fibo[n] > 0) return fibo[n];
        else return fibo[n] = recursive(n-1) + recursive(n-2);
    }
}
