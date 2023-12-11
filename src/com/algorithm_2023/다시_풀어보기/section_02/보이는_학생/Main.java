package com.algorithm_2023.다시_풀어보기.section_02.보이는_학생;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] heightArray = new int[num];
        for (int i = 0; i < num; i++) {
            heightArray[i] = scanner.nextInt();
        }
        System.out.println(solution(heightArray));
    }

    private static int solution(int[] heightArray) {
        int max = Integer.MIN_VALUE, count = 0;
        for (int height : heightArray) {
            if (height > max) {
                max = height;
                count++;
            }
        }
        return count;
    }
}
