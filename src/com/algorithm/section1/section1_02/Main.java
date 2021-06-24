package com.algorithm.section1.section1_02;

import java.util.Scanner;

public class Main {
    public String solution(String str) {

        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            }
            else {
                result.append(Character.toUpperCase(c));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(m.solution(str));

    }
}
