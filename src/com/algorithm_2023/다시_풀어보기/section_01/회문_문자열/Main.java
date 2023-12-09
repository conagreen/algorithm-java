package com.algorithm_2023.다시_풀어보기.section_01.회문_문자열;

import java.util.Scanner;

/*
* 입력된 문자열이 회문 문자열이면 "YES" 출력, 아니라면 "NO" 출력 (대소문자 구분 X)
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }

    private static String  solution(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (chars[lt++] != chars[rt--]) return "NO";
        }
        return "YES";
    }
}
