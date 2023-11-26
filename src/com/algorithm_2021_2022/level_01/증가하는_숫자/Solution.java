package com.algorithm_2021_2022.level_01.증가하는_숫자;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        long[] result = solution.solution(x, n);

        System.out.println(Arrays.toString(result));
    }
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i-1] + x;
        }

        return answer;
    }
}