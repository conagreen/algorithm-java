package com.algorithm.level_01.부녀회장이_될테야;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    int[][] arr;

    {
        int size = 14;
        arr = new int[size + 1][size + 1];
        for (int i = 0; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 0) arr[0][j] = j;
                else arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] position = new int[t][2];

        for (int i = 0; i < t; i++) {
            position[i][0] = Integer.parseInt(br.readLine());
            position[i][1] = Integer.parseInt(br.readLine());
        }

        for (int num : main.solution(position)) {
            System.out.println(num);
        }
    }

    private int[] solution(int[][] position) {
        int len = position.length;
        int[] nums = new int[len];

        for (int i = 0; i < len; i++) {
            int k = position[i][0];
            int n = position[i][1];
            nums[i] = arr[k][n];
        }

        return nums;
    }
}
