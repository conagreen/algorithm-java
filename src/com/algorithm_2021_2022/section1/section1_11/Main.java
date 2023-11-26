package com.algorithm_2021_2022.section1.section1_11;

import java.util.Scanner;

public class Main {

    // 마지막 인덱스를 조건문으로 처리해서 구현한 방식
//    public void solution1(String str) {
//        int count = 1;
//        int len = str.length();
//        int i = 0;
//
//        while (i < len) {
//            if (i == len - 1) {
//                if (str.charAt(i) == str.charAt(i - 1)) {
//                    System.out.print(str.charAt(i) + "" + count);
//                    i++;
//                } else {
//                    count = 1;
//                    System.out.println(str.charAt(i));
//                    i++;
//                }
//            } else if (str.charAt(i) == str.charAt(i + 1)) {
//                count++;
//                i++;
//            } else {
//                if (count > 1) {
//                    System.out.print(str.charAt(i) + "" + count);
//                    count = 1;
//                    i++;
//                } else {
//                    System.out.print(str.charAt(i));
//                    count = 1;
//                    i++;
//                }
//            }
//        }

    // 마지막 인덱스에 빈문자를 추가해서 구현한 방식
    private void solution2(String str) {
        str += " ";
        int count = 1;
        char[] charArray = str.toCharArray();


        for (int i = 0; i < str.length()-1; i++) {
            if (charArray[i] == charArray[i+1]) {
                count++;
            } else {
                if (count > 1) {
                    System.out.print(charArray[i] + "" + count);
                    count = 1;
                } else {
                    System.out.print(charArray[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        // 마지막 인덱스를 조건문으로 처리해서 구현한 방식
//        m.solution1(str);

        // 마지막 인덱스에 빈문자를 추가해서 구현한 방식
        m.solution2(str);
    }
}
