package com.algorithm.level_01.짝수_홀수_구분;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String result = solution.solution(num);

        System.out.println(result);
    }
    public String solution(int num) {
        String answer;

        if (num % 2 == 0) answer = "Even";
        else answer = "Odd";

        return answer;
    }
}