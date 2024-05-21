package com.algorithm_2024.section02_배열.알파벳_개수;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* 백준 - 10808
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> answer = calculateAlphabetOccurrences(scanner.next());
        for (int c : answer.values()) {
            System.out.print(c + " ");
        }
    }

    private static Map<Integer, Integer> calculateAlphabetOccurrences(String str) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 97; i <= 122; i++) {
            map.put(i, 0);
        }
        
        for (char c : str.toCharArray()) {
            map.put((int) c, map.get((int)c) + 1);
        }

        return map;
    }
}
