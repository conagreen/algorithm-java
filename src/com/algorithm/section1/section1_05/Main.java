package com.algorithm.section1.section1_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

//    public String solution1(String str) {
//        char[] charArray = str.toCharArray();
//        int left = 0, right = str.length()-1;
//
//        String pattern = "^[a-zA-Z]*$";
//
//        while (left < right) {
//
//            if (!Pattern.matches(pattern, String.valueOf(charArray[left]))) {
//                left++;
//            } else if (!Pattern.matches(pattern, String.valueOf(charArray[right]))) {
//                right--;
//            } else {
//                char temp = charArray[left];
//
//                charArray[left] = charArray[right];
//                charArray[right] = temp;
//
//                left++;
//                right--;
//            }
//        }
//
//        return String.valueOf(charArray);
//    }

    private String solution2(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = str.length()-1;

        while (left < right) {
            if (!Character.isAlphabetic(charArray[left])) {
                left++;
            } else if (!Character.isAlphabetic(charArray[right])) {
                right--;
            } else {
                char temp = charArray[left];

                charArray[left] = charArray[right];
                charArray[right] = temp;

                left++;
                right--;
            }
        }

        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        // isAlphabetic() 이용하지 않고 구현
//        System.out.println(m.solution1(str));

        // // isAlphabetic() 이용해서 구현
        System.out.println(m.solution2(str));

    }
}
