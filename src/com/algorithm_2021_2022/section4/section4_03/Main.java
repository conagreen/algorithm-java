package com.algorithm_2021_2022.section4.section4_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] days = new int[num];
        for (int i = 0; i < num; i++) {
            days[i] = Integer.parseInt(st.nextToken());
        }

        for (int x : m.solution(num, target, days)) {
            System.out.print(x + " ");
        }
    }

    private int[] solution(int num, int target, int[] days) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[num-(target-1)];
        int lt = 0;

        for (int i = 0; i < target-1; i++) {
            map.put(days[i], map.getOrDefault(days[i], 0)+1);
        }

        for (int rt = target-1; rt < num; rt++) {
            int daysRt = days[rt];
            int daysLt = days[lt];
            map.put(daysRt, map.getOrDefault(daysRt, 0)+1);

            result[lt] = map.size();

            if (map.get(daysLt) == 1) {
                map.remove(daysLt);
            } else {
                map.put(daysLt, map.get(daysLt)-1);
            }
            lt++;
        }

        return result;
    }
}
