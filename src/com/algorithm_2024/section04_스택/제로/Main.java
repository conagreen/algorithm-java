package com.algorithm_2024.section04_스택.제로;

import java.util.Scanner;
import java.util.Stack;

/*
* 백준 - 10773
* */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (input == 0) stack.pop();
            else stack.push(input);
        }

        int sum = 0;
        for (int target : stack) {
            sum += target;
        }
        System.out.print(sum);
    }
}
