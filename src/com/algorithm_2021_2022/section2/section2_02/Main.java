package com.algorithm_2021_2022.section2.section2_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArray = new int[num];

        for (int i = 0; i < num; i++){
            numArray[i] = scanner.nextInt();
        }

        System.out.println(main.solution(num, numArray));
    }

    public int solution(int num, int[] numArray) {
        int result = 1;
        int max = numArray[0];

        for (int i = 1; i < num; i++) {
            if (numArray[i] > max) {
                max = numArray[i];
                result++;
            }
        }

        return result;
    }
}
