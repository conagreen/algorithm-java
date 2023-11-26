package com.algorithm_2021_2022.level_01.그룹_단어_체커;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        final int result = main.solution(arr);
        System.out.println(result);
    }

    private int solution(String[] arr) {
        int result = 0;
        for (String word : arr) {
            if (isGroupWord(word)) result++;
        }
        return result;
    }

    private boolean isGroupWord(String word) {
        char[] alpha = word.toCharArray();

        for (int i = 0; i < word.length()-1; i++) {
            if (alpha[i] != alpha[i+1]) {
                if (word.indexOf(alpha[i], i+1) > i) return false;
            }
        }
        return true;
    }
}
