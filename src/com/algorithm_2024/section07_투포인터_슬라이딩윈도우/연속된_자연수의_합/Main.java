package com.algorithm_2024.section07_투포인터_슬라이딩윈도우.연속된_자연수의_합;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 3-5
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0, answer = 0, lt = 1;
        int end = n % 2 == 0 ? n / 2 : n / 2 + 1;
        for (int rt = 1; rt <= end; rt++) {
            sum += rt;
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= lt++;
                if (sum == n) answer++;
            }
        }
        System.out.print(answer);
    }
}
