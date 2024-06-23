package com.algorithm_2024.section08_HashMap_TreeSet.학급_회장;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
 * 인프런 - 자바 알고리즘 4-1
 * */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        Character answer = null;
        for (char candidate : arr) {
            int cnt = map.getOrDefault(candidate, 0) + 1;
            if (cnt > max) {
                max = cnt;
                answer = candidate;
            }
            map.put(candidate, cnt);
        }
        System.out.println(answer);
    }
}

