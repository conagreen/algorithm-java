package com.algorithm_2023.다시_풀어보기.section_01.문장_속_단어;

import java.util.Scanner;

/*
* 주어진 문장 속 가장 긴 단어 출력
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "";
        final int i = str.indexOf(" ");
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.length() > answer.length()) {
                answer = word;
            }
        }
        return answer;
    }
}
