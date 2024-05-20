package com.algorithm_2024.section01_기초.section01_04;

/*
* N 이하의 수 중에서 가장 큰 2의 거듭제곱수를 반환 -> O(logN)
* */
public class Solution {
    public static void main(String[] args) {
        System.out.println(func(97615282));
    }

    private static long func(int n) {
        int max = 1;
        for (int i = 1; i <= n; i = max) {
            if (i * 2 > n) {
                break;
            }
            max = i * 2;
        }
        return max;
    }
}
