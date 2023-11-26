package com.algorithm_2021_2022.level_01.다이얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = main.solution(str);
        System.out.println(result);
    }

    private int solution(String str) {
        char[] alphas = str.toCharArray();
        int[] numbers = new int[alphas.length];
        int result = 0;

        for (int i = 0; i < alphas.length; i++) {
            numbers[i] = changeToNumber(alphas[i]);
            result += necessaryTime(numbers[i]);
        }

        return result;
    }

    private int necessaryTime(int second) {
        return second+1;
    }

    private int changeToNumber(char alpha) {
        if (alpha >= 'A' && alpha <= 'C') return 2;
        else if (alpha >= 'D' && alpha <= 'F') return 3;
        else if (alpha >= 'G' && alpha <= 'I') return 4;
        else if (alpha >= 'J' && alpha <= 'L') return 5;
        else if (alpha >= 'M' && alpha <= 'O') return 6;
        else if (alpha >= 'P' && alpha <= 'S') return 7;
        else if (alpha >= 'T' && alpha <= 'V') return 8;
        else return 9;
    }
}
