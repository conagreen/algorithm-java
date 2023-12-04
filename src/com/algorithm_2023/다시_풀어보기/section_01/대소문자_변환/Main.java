package com.algorithm_2023.다시_풀어보기.section_01.대소문자_변환;

import java.util.Scanner;

/*
* 문자열의 대문자는 -> 소문자로 / 소문자는 -> 대문자로 변화
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String str = scanner.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        char[] targets = str.toCharArray();

        for (char target : targets) {
            if (Character.isUpperCase(target)) {
                answer.append((char)(target + 32));
            } else {
                answer.append((char)(target - 32));
            }
        }
        return answer.toString();
    }
}
