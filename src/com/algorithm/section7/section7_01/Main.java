package com.algorithm.section7.section7_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        m.solution(num);
    }

    private void solution(int num) {
        if (num == 0) return;
        else {
            solution(num-1);
            System.out.print(num + " ");
        }
    }
}
