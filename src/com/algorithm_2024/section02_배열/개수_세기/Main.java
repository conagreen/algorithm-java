package com.algorithm_2024.section02_배열.개수_세기;

import java.util.Scanner;

/*
* 백준 - 10807
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(count(nums, target));
    }

    private static int count(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}
