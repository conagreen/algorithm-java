package com.algorithm_2024.section09_정렬.장난꾸러기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 6-6
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] students = new int[n];
        for (int i = 0; i < n; i++) students[i] = scanner.nextInt();

        int[] origin = students.clone();
        Arrays.sort(origin);

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) if (students[i] != origin[i]) answer.append(i + 1).append(" ");
        System.out.println(answer);
    }
}
