package com.algorithm_2024.section05_큐.교육과정_설계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 * 인프런 - 자바 알고리즘 5-7
 * */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<String> requiredSubjects = new LinkedList<>(Arrays.asList(br.readLine().split("")));
        String[] subjects = br.readLine().split("");
        for (String subject : subjects) {
            if (subject.equals(requiredSubjects.peek())) requiredSubjects.poll();
        }

        System.out.println(requiredSubjects.isEmpty() ? "YES" : "NO");
    }
}
