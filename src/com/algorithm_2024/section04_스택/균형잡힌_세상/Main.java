package com.algorithm_2024.section04_스택.균형잡힌_세상;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
* 백준 - 4949
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            char[] testCase = br.readLine().toCharArray();
            if (testCase.length == 1 && testCase[0] == '.') {
                return;
            }
            String answer = "yes";
            Stack<Character> stack = new Stack<>();
            for (char c : testCase) {
                switch (c) {
                    case '[':
                        stack.push(']');
                        break;
                    case '(':
                        stack.push(')');
                        break;
                    case ']':
                        if (stack.isEmpty() || stack.pop() != ']') {
                            answer = "no";
                            break;
                        }
                        break;
                    case ')':
                        if (stack.isEmpty() || stack.pop() != ')') {
                            answer = "no";
                            break;
                        }
                }
            }

            if (!stack.isEmpty()) {
                answer = "no";
            }
            System.out.println(answer);
        }
    }
}