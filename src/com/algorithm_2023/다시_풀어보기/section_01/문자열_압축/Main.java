package com.algorithm_2023.다시_풀어보기.section_01.문자열_압축;

import java.util.Scanner;

/*
* 입력받은 문자열에서 같은 문자가 연속으로 반복되는 횟수를 문자 바로 오른쪽에 표기하는 방법으로 문자열을 압축
* 단, 반복 횟수가 1인 경우 횟수는 생략하고 알파벳만 표기.
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(solution(str));
    }

    private static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        char target = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                count++;
                continue;
            }
            sb.append(target);
            if (count > 1) sb.append(count);
            target = str.charAt(i);
            count = 1;
        }

        sb.append(target);
        if (count > 1) sb.append(count);
        return sb.toString();
    }
}
