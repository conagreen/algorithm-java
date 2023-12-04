package com.algorithm_2023.다시_풀어보기.section_01.문자_찾기;

import java.util.Scanner;

/*
* 특정 문자가 문자열에 몇개 존재하는 알아내기 (대소문자 구분 X)
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char c = scanner.next().charAt(0);
        System.out.println(solution(str, c));
    }

    public static int solution(String str, char c) {
        String[] strArray = str.toLowerCase().split("");
        String target = String.valueOf(c).toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (strArray[i].equals(target)) {
                count++;
            }
        }
        return count;
    }
}
