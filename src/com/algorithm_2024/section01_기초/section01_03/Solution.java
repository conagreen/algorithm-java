package com.algorithm_2024.section01_기초.section01_03;

/*
* N이 제곱수이면 1을 반환, 아니면 0을 반환 -> O(sqrt(n))
* */
public class Solution {
    public static void main(String[] args) {
        System.out.println(func(756580036));
    }

    private static long func(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                return 1;
            }
        }
        return 0;
    }
}
