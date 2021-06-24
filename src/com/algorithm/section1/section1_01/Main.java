package com.algorithm.section1.section1_01;

import java.util.Scanner;

public class Main {
    public int solution(String str, char chr) {
        int count = 0;

        str = str.toUpperCase();
        chr = Character.toUpperCase(chr);

        for (char c : str.toCharArray()) {
            if (c == chr)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char chr = scanner.next().charAt(0);

        int result = m.solution(str, chr);

        System.out.print(result);
    }
}
