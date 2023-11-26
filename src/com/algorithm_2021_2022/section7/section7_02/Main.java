package com.algorithm_2021_2022.section7.section7_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        m.recursive(num);
    }

    private void recursive(int num) {
        if (num == 0) return;
        else {
            recursive(num / 2);
            System.out.print(num % 2);
        }

    }
}
