package com.algorithm.level_01.손익분기점;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        long result = main.solution(a, b, c);
        System.out.println(result);
    }

    private long solution(int a, int b, int c) {
        long sum = a, sellingPrice = 0;
        long count = 0;

        if (b >= c) count = -1;
        else {
            while (sum >= sellingPrice) {
                sum += b;
                sellingPrice += c;
                count++;
            }
        }

        return count;
    }

}
