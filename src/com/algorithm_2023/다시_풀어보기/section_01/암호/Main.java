package com.algorithm_2023.다시_풀어보기.section_01.암호;

import java.util.Scanner;

/*
* 암호 문자열을 문제에 주어진 방식대로 복호화하여 읽을 수 있는 문자열로 최종 변환하여 출력
* (유료 문제이기 때문에 자세한 문제 내용은 공개할 수 없음)
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int num = Integer.parseInt(scanner.nextLine());
        final String str = scanner.nextLine();
        System.out.println(solution(num, str));
    }

    private static String solution(int num, String str) {
        StringBuilder sb = new StringBuilder();
        String[] ciphers = new String[num];
        for (int i = 0; i < num; i++) {
            ciphers[i] = str.substring(0, 7);
            str = str.substring(7);
            sb.append(decode(ciphers[i]));
        }
        return sb.toString();
    }

    private static char decode(String cipher) {
        final String binaryNumber = convertToBinaryNumber(cipher);
        final int decimalNumber  = Integer.parseInt(binaryNumber, 2);
        return (char)decimalNumber;
    }

    private static String convertToBinaryNumber(String cipher) {
        StringBuilder sb = new StringBuilder();
        for (char c : cipher.toCharArray()) {
            if (c == '#') sb.append("1");
            if (c == '*') sb.append("0");
        }
        return sb.toString();
    }
}
