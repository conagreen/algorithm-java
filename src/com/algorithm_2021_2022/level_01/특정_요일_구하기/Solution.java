package com.algorithm_2021_2022.level_01.특정_요일_구하기;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String result = solution.solution(a, b);
        System.out.println(result);
    }

    public String solution(int a, int b) {
        String answer;
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        answer = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();

        return answer;
    }
}