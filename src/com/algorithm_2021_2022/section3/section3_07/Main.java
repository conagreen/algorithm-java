package com.algorithm_2021_2022.section3.section3_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int chance = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] numArray = new int[num];

        for (int i = 0; i < num; i++) {
            numArray[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(num, chance, numArray));
    }

    private int solution(int num, int chance, int[] numArray) {
        int result = 0, cnt = 0, lt = 0;

        for (int rt = 0; rt < num; rt++) {
            if (numArray[rt] == 0) cnt++;
            while (cnt > chance) {
                if (numArray[lt] == 0) cnt--;
                lt++;
            }
            result = Math.max(result, rt-lt+1);
        }

        return result;
    }
}