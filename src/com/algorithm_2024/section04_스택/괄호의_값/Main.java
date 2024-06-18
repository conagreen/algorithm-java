package com.algorithm_2024.section04_스택.괄호의_값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * 백준 - 2504
 * */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        int value = 1;
        int answer = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
                value *= 2;
            } else if (input.charAt(i) == '[') {
                stack.push(input.charAt(i));
                value *= 3;
            } else if (input.charAt(i) == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    answer = 0;
                    break;
                } else if (input.charAt(i-1) == '(') {
                    answer += value;
                }
                stack.pop();
                value /= 2;
            } else if (input.charAt(i) == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    answer = 0;
                    break;
                } else if (input.charAt(i - 1) == '[') {
                    answer += value;
                }
                stack.pop();
                value /= 3;
            }
        }

        if (!stack.isEmpty()) {
            answer = 0;
        }
        System.out.print(answer);
    }
}

