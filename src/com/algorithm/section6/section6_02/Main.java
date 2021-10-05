package com.algorithm.section6.section6_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] nums = new int[num];

        for (int i = 0; i < num; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int x : m.solution(num, nums)) {
            System.out.print(x + " ");
        }

    }

    private int[] solution(int num, int[] nums) {

        for (int i = 0; i < num-1; i++) {
            for (int j = 0; j < num-1-i; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        return nums;
    }
}
