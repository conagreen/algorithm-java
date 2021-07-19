package com.algorithm.section3.section3_05;

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
        int len = target / 2;
        int left = 1, right = 2;
        int sum = left + right;
        int result = 0;

        while (left <= len) {
            if (sum == target) {
                result++;
                sum -= left++;
            } else if (sum < target) {
                right++;
                sum += right;
            } else {
                sum -= left++;
            }
        }

        return result;
    }
}

