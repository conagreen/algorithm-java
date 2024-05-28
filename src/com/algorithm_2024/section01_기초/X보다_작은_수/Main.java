package com.algorithm_2024.section01_기초.X보다_작은_수;

import java.io.IOException;
import java.util.Scanner;

/*
* 백준 - 10871
* */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (x > input) System.out.print(input + " ");
        }
    }
}
