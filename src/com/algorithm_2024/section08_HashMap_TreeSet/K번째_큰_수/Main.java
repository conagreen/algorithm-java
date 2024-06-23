package com.algorithm_2024.section08_HashMap_TreeSet.K번째_큰_수;

import java.util.*;

/*
 * 인프런 - 자바 알고리즘 4-5
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int l = j + 1; l < arr.length; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int answer = -1;
        for (Integer num : set) {
            if (--k == 0) {
                answer = num;
                break;
            }
        }

        System.out.println(answer);
    }
}