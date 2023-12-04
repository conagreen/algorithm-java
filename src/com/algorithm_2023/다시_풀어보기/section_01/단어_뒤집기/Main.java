package com.algorithm_2023.다시_풀어보기.section_01.단어_뒤집기;

import java.util.Scanner;

/*
* 입력된 n개의 단어를 뒤집어 출력
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] words = new String[num];

        for (int i = 0; i < num; i++) {
            words[i] = scanner.nextLine();
        }

        for (String answer : solution(num, words)) {
            System.out.println(answer);
        }
    }

    private static String[] solution(int num, String[] words) {
        String[] answer = new String[num];
        for (int i = 0; i < num; i++) {
            char[] wordArray = words[i].toCharArray();
            int length = words[i].length();
            int limit = length / 2;
            for (int lt = 0; lt < limit; lt++) {
                char temp = wordArray[lt];
                int rt = length - lt - 1;
                wordArray[lt] = wordArray[rt];
                wordArray[rt] = temp;
            }
            answer[i] = String.valueOf(wordArray);
        }
        return answer;
    }
}
