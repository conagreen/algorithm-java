package com.algorithm_2023.다시_풀어보기.section_02.피보나치_수열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int answer : solution(num)) {
            System.out.print(answer + " ");
        }
    }

    private static int[] solution(int num) {
        int[] answer = new int[num];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < num; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        return answer;
    }
}
