package com.algorithm.section2.section2_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] a = new int[num];
        int[] b = new int[num];

        for (int i = 0; i < num; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < num; i++) {
            b[i] = scanner.nextInt();
        }

        m.solution(num, a, b);
    }

    private void solution(int num, int[] a, int[] b) {
        for (int i = 0; i < num; i++) {
            if (a[i] == b[i]) {
                System.out.println("D");
            } else if (a[i] == 1 && b[i] == 3) {
                System.out.println("A");
            } else if (a[i] == 2 && b[i] == 1) {
                System.out.println("A");
            } else if (a[i] == 3 && b[i] == 2) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }

        }

    }
}
