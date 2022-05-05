package com.algorithm.level_01.윤년;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = main.solution(n);
        System.out.println(result);
    }

    private int solution(int n) {
        if (n % 4 == 0 && n % 100 != 0) return 1;
        else if (n % 400 == 0) return 1;
        else return 0;
    }
}
