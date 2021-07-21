package com.algorithm.section4.section4_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String vote  = br.readLine();

        System.out.println(m.solution(num, vote));

    }

    private char solution(int num, String vote) {
        int max = 0;
        char result = ' ';

        Map<Character, Integer> candidatesMap = new HashMap<>();

        for (char key : vote.toCharArray()) {
            candidatesMap.put(key, candidatesMap.getOrDefault(key, 0)+1);
        }

        for (char key : candidatesMap.keySet()) {
            int nowValue = candidatesMap.get(key);
            if (nowValue > max) {
                max = nowValue;
                result = key;
            }
        }

        return result;
    }
}
