package com.algorithm_2021_2022.section1.section1_07;

import java.util.Scanner;

public class Main {

    // StringBuilder 없이 구현
//    public String solution1(String str) {
//        str = str.toUpperCase();
//        String result = "YES";
//        int len = str.length();
//
//        for (int i = 0, limit = len/2; i < limit; i++) {
//            if (str.charAt(i) != str.charAt(len-i-1)) {
//                result = "NO";
//                break;
//            }
//        }
//
//        return result;
//    }

    // StringBuilder로 구현
    private String solution2(String str) {
        String result = "NO";
        String temp = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(temp)){
            result = "YES";
        }

        return result;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        // StringBuilder 없이 구현
//        System.out.println(m.solution1(str));

        // StringBuilder로 구현
        System.out.println(m.solution2(str));


    }
}
