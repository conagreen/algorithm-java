package com.algorithm_2021_2022.section5.section5_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solution(str));
    }

    private int solution(String str) {
        char[] brackets = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0, len = str.length(); i < len; i++) {
            if (brackets[i] == '(') {
                stack.push(brackets[i]);
            } else {
                stack.pop();
                if (brackets[i-1] == '(') count += stack.size();
                else count++;
            }
        }

        return count;
    }
}
