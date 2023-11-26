package com.algorithm_2021_2022.section1.section1_03;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String word, result = "";
        int indexOfSpace, len;


        // split() 이용해서 풀어본 코드
//        String[] strArray = str.split(" ");
//
//        for (String temp : strArray) {
//            if(temp.length() > result.length()){
//                result = temp;
//            }
//        }


        // substring()과 indexOd() 이용해서 풀어본 코드
        while ((indexOfSpace = str.indexOf(" ")) != -1) {
            word = str.substring(0, indexOfSpace);
            len = word.length();

            if(len > result.length()) {
                result = word;
            }

            str = str.substring(indexOfSpace+1);
        }

        if (str.length() > result.length()) {
            result = str;
        }

        return result;
    }


    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(m.solution(str));
    }
}
