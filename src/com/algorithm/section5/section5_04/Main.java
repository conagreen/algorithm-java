package com.algorithm.section5.section5_04;

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
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) stack.push((int)x - 48);
            else {
                int b = stack.pop();
                int a = stack.pop();
                switch (x) {
                    case '+' :
                        stack.push(a+b);
                        break;
                    case '-' :
                        stack.push(a-b);
                        break;
                    case '*' :
                        stack.push(a*b);
                        break;
                    case '/' :
                        stack.push(a/b);
                        break;
                }
            }
        }

        return stack.get(0);
    }
}
