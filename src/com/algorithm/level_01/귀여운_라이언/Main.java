package com.algorithm.level_01.귀여운_라이언;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = main.solution(n, k, arr);
        System.out.println(result);
    }

    private int solution(int n, int k, int[] arr) {
        int min = Integer.MAX_VALUE;
        int count = 0, size = 0;
        int lt = 0, rt = 0;

        while (lt < n && rt < n) {
            while (count < k && rt < n) {
                if (arr[rt] == 1) count++;
                size++;
                rt++;
            }

            while (count == k && lt < n) {
                if (arr[lt] == 1) {
                    min = Math.min(min, size);
                    count--;
                }
                lt++;
                size--;
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
