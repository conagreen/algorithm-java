package com.algorithm_2021_2022.section1.section1_08;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String result = "NO";
        String temp;

        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        temp = new StringBuilder(str).reverse().toString();

        if (str.equals(temp)) result = "YES";

        return result;
    }
    
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(m.solution(str));
    }
}
