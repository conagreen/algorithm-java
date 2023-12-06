package com.algorithm_2023.다시_풀어보기.section_01.가장_짧은_문자거리;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        for (int answer : solution(str, c)) {
            System.out.print(answer + " ");
        }
    }

    private static int[] solution(String str, char c) {
        int[] distances = new int[str.length()];
        int position = str.indexOf(c);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                position = i;
            }
            distances[i] = Math.abs(position - i);
        }

        position = str.lastIndexOf(c);

        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) == c) {
                position = i;
            }
            distances[i] = Math.min(Math.abs(position - i), distances[i]);
        }

        return distances;
    }
}
