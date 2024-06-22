package com.algorithm_2024.section07_투포인터_슬라이딩윈도우.연속된_자연수의_합_수학;

import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 3-5
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 0, cnt = 1;
        n -= cnt;
        while (n > 0) {
            cnt++;
            n -= cnt;
            if (n % cnt == 0) answer++;
        }
        System.out.print(answer);
    }
}
