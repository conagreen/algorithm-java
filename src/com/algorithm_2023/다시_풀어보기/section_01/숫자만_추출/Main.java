package com.algorithm_2023.다시_풀어보기.section_01.숫자만_추출;

import java.util.Scanner;

/*
* 문자와 숫자가 섞여있는 문자열에서 숫자만 추출하여 자연수로 출력 (예 - tge0a1h205er -> 1205)
* */
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
