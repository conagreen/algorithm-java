package com.algorithm_2021_2022.section6.section6_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cache = Integer.parseInt(st.nextToken());
        int amount = Integer.parseInt(st.nextToken());
        int[] tasks = new int[amount];
        st = new StringTokenizer((br.readLine()));

        for (int i = 0; i < amount; i++) {
            tasks[i] = Integer.parseInt(st.nextToken());
        }

        for (int task : m.solution(cache, amount, tasks)) {
            System.out.print(task + " ");
        }
    }

    private Integer[] solution(int cache, int amount, int[] tasks) {
        Integer[] result = new Integer[cache];

        for (int i = 0; i < amount; i++) {
            int idx = cache - 1;
            if (Arrays.asList(result).contains((tasks[i]))) {
                idx = Arrays.asList(result).indexOf(tasks[i]);
            }
            while (idx > 0) {
                result[idx] = result[idx - 1];
                idx--;
            }
            result[idx] = tasks[i];

        }

        return result;
    }
}
