package com.algorithm.section1.section1_06;

import java.util.Scanner;

public class Main {

    public String solution(String str){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            if (i == str.indexOf(str.charAt(i))) {
                result.append(str.charAt(i));
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
