package com.algorithm_2023.다시_풀어보기.section_02.가위_바위_보;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int round = Integer.parseInt(scanner.nextLine());
        int[][] games = new int[2][round];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < round; j++) {
                games[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < round; i++) {
            System.out.println(solution(games[0][i], games[1][i]));
        }
    }

    private static char solution(int a, int b) {
        if (a == b) return 'D';
        if (a == 1 && b == 3) return 'A';
        if (a == 2 && b == 1) return 'A';
        if (a == 3 && b == 2) return 'A';
        return 'B';
    }
}