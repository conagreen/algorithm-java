package com.algorithm_2021_2022.level_01.팩토리얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = recursive(n);
        System.out.println(result);
    }

    private static int recursive(int n) {
        if (n == 0 || n == 1) return 1;
        else return n * recursive(n-1);
    }
}
