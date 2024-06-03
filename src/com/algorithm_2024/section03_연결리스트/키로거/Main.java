package com.algorithm_2024.section03_연결리스트.키로거;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

/*
* 백준 - 5397
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            System.out.println(solution(br.readLine()));
        }
    }

    private static String solution(String input) {
        String[] tokens = input.split("");
        LinkedList<Character> password = new LinkedList<>();
        ListIterator<Character> iterator = password.listIterator();
        for (String token : tokens) {
            switch (token) {
                case "<":
                    if (iterator.hasPrevious())
                        iterator.previous();
                    break;
                case ">":
                    if (iterator.hasNext())
                        iterator.next();
                    break;
                case "-":
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                        iterator.remove();
                    }
                    break;
                default:
                    iterator.add(token.charAt(0));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : password) {
            sb.append(c);
        }
        return sb.toString();
    }
}
