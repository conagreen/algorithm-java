package com.algorithm_2024.section04_스택.쇠막대기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * 백준 - 10799
 * */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String info = br.readLine();
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < info.length(); i++) {
            if (info.charAt(i) == '(') {
                if (info.charAt(i + 1) == ')') {
                    count += stack.size();
                    i++;
                    continue;
                }
                stack.push('(');
            }

            if (info.charAt(i) == ')') {
                stack.pop();
                count++;
            }
        }

        System.out.print(count);
    }
}
