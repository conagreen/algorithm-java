package com.algorithm_2021_2022.section3.section3_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());

        System.out.println(m.solution(target));
    }

    private int solution(int target) {
        int result = 0;
        int num = 1;
        target--;

        while (target > 0) {
            num++;
            target -= num;
            if (target % num == 0) result++;
        }

        return result;
    }
}
