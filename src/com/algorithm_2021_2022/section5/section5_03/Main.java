package com.algorithm_2021_2022.section5.section5_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] nums = new int[n][n];
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int m = Integer.parseInt(br.readLine());
        int[] moves = new int[m];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) moves[i] = Integer.parseInt(st.nextToken());

        System.out.println(main.solution(n, nums, m, moves));
    }

    private int solution(int n, int[][] nums, int m, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int act : moves) {
            for (int j = 0; j < n; j++) {
                if (nums[j][act-1] != 0) {
                    int toy = nums[j][act-1];
                    if (!stack.isEmpty() && stack.peek() == toy) {
                            stack.pop();
                            count+=2;
                    } else {
                        stack.push(toy);
                    }
                    nums[j][act-1] = 0;
                    break;
                }
            }
        }

        return count;
    }

}
