package com.algorithm_2024.section04_스택.스택_수열;

import java.util.Scanner;
import java.util.Stack;

/*
* 백준 - 1874
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        int num = 1;

        for (int i = 0; i < n; i++) {
            int target = input[i];
            while (num <= n + 1) {
                if (!stack.isEmpty() && stack.peek() == target) {
                    stack.pop();
                    sb.append("-");
                    break;
                }

                stack.push(num);
                num++;
                sb.append("+");
            }
        }

        if (stack.isEmpty()) {
            for (char c : sb.toString().toCharArray()) {
                System.out.println(c);
            }
        } else System.out.println("NO");
    }
}
