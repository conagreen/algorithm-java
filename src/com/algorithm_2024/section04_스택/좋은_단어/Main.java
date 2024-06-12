package com.algorithm_2024.section04_스택.좋은_단어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
* 백준 - 3986
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < num; i++) {
            if (isGoodWord(br.readLine())) answer++;
        }
        System.out.print(answer);
    }

    private static boolean isGoodWord(String word) {
        Stack<Character> stack = new Stack<>();
        stack.push(word.charAt(0));
        for (int i = 1; i < word.length(); i++) {
            if (stack.isEmpty() || stack.peek() != word.charAt(i)) {
                stack.add(word.charAt(i));
                continue;
            }

            if (stack.peek() == word.charAt(i)) {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
