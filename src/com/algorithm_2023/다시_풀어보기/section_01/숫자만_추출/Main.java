package com.algorithm_2023.다시_풀어보기.section_01.숫자만_추출;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        return Integer.parseInt(str.toLowerCase().replaceAll("[a-z]", ""));
    }
}
