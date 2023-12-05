package com.algorithm_2023.다시_풀어보기.section_01.중복_문자_제거;

import java.util.Scanner;

/*
* 입력된 문자열에서 중복된 문자는 모두 제거한 후 출력 (순서는 유지되어야 함)
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        char[] chars = str.toCharArray();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            answer.append(chars[i]);
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    chars[j] = '0';
                }
            }
        }
        return answer.toString();
    }
}

