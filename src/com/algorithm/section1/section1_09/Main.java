package com.algorithm.section1.section1_09;

import java.util.Scanner;

public class Main {

    // replaceAll() 이용해서 구현
//    public int solution1(String str) {
//        str = str.replaceAll("[^0-9]", "");
//        int result = Integer.parseInt(str);
//
//        return result;
//    }

    // 아스키 코드 이용해서 구현
//    private int solution2(String str) {
//        int result = 0;
//
//        for (int i=0; i<str.length(); i++){
//            if (48 <= str.charAt(i) && str.charAt(i) <= 57) {
//                result = result * 10 + (str.charAt(i) - 48);
//            }
//        }
//
//        return result;
//    }

    // isDigit() 이용해서 구현
    private int solution3(String str) {
        String result = "";

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) result += x;
        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        // replaceAll() 이용해서 구현
//        System.out.println(m.solution1(str));

        // 아스키 코드 이용해서 구현
//        System.out.println(m.solution2(str));

        // isDigit() 이용해서 구현
        System.out.println(m.solution3(str));
    }
}
