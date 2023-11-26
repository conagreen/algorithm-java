package com.algorithm_2021_2022.level_01.달팽이는_올라가고_싶다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int result = main.solution(a, b, v);
        System.out.println(result);
    }

    private int solution(int a, int b, int v) {
        int result = ((Math.abs(v - a) / (a - b))) + 1;
        if ((v - a) % (a - b) > 0) return result + 1;
        else return result;
    }
}
