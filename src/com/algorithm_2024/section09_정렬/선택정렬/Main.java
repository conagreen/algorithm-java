package com.algorithm_2024.section09_정렬.선택정렬;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 6-1
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int idxOfMin = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[idxOfMin]) idxOfMin = j;
            }
            int temp = nums[i];
            nums[i] = nums[idxOfMin];
            nums[idxOfMin] = temp;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
