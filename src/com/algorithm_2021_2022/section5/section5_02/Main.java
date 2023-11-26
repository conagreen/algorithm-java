package com.algorithm_2021_2022.section5.section5_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(m.solution(str));
    }

    private String solution(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else if (x == ')') stack.pop();
            else {
                if (stack.isEmpty()) sb.append(x);
            }
        }
        return sb.toString();
    }
}
