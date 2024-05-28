package com.algorithm_2024.section01_기초.section01_02;

/*
* 주어진 길이 n의 int 배열 arr에서 합이 100인 서로 다른 위치의 두 원소가 존재하면 1을, 그렇지 않으면 0을 반환
* */
public class Solution {
    public static void main(String[] args) {
        System.out.println(fun1(new int[]{1, 52, 48}, 3));
        System.out.println(func2(new int[]{1, 52, 48}, 3));
    }

    // O(N^2)
    private static long fun1(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == 100) {
                    return 1;
                }
            }
        }
        return 0;
    }

    // O(N)
    private static long func2(int[] arr, int n) {
        int[] template = new int[101];
        for (int i = 0; i < n; i++) {
            if (template[100 - arr[i]] == 1) {
                return 1;
            }
            template[arr[i]] = 1;
        }
        return 0;
    }
}
