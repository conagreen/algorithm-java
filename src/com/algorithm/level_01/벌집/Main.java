package com.algorithm.level_01.벌집;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = main.solution(n);
        System.out.print(result);
    }

    private int solution(int n) {
        int count = 1;
        int x = 1;

        while (n > x) {
            for (int i = 0; i < 6 * count; i++) {
                x++;
            }
            count++;
        }

        return count;
    }
}
