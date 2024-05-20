package com.algorithm_2024.section01_기초.section01_01;

/*
* n 이하의 자연수 중에서 3의 배수이거나 5의 배수인 수를 모두 합한 값을 반환 -> O(N)
* */
public class Solution {
    public static void main(String[] args) {
        System.out.println(func(16));
    }

    private static long func(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
