package com.algorithm.section6.section6_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        char result = m.solution(arr);

        System.out.println(result);
    }

    private char solution(int[] arr) {
        boolean result = isDuplicated(arr);

        return result ? 'D' : 'U';
    }

    private boolean isDuplicated(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0)+1);
            if (map.get(x) > 1) return true;
        }

        return false;
    }
}
