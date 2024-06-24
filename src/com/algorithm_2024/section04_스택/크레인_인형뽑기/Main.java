package com.algorithm_2024.section04_스택.크레인_인형뽑기;

import java.util.Scanner;
import java.util.Stack;

/*
 * 인프런 - 자바 알고리즘 5-3
 * */
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < m; i++) {
            int move = sc.nextInt();
            for (int j = 0; j < n; j++) {
                if (board[j][move - 1] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[j][move - 1]) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(board[j][move - 1]);
                    }
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        System.out.print(answer);
    }
}
