package com.algorithm_2021_2022.level_01.알람시계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        main.solution(h, m);
    }

    private void solution(int h, int m) {
        if (m >= 45) m -= 45;
        else {
            h--;
            m = m + 60 - 45;
            if (h < 0) h = 23;
        }
        System.out.println(h + " " + m);
    }
}
