package com.algorithm_2021_2022.section7.section7_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        final int result = m.recursive(num);
        System.out.println(result);
    }

    private int recursive(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * recursive(num-1);
        }
    }
}