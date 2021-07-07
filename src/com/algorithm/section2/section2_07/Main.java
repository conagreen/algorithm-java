package com.algorithm.section2.section2_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] numArray = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            numArray[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(num, numArray));
    }

    public int solution(int num, int[] numArray) {
        int totalScore = 0;
        int score = 0;

        for (int i = 0; i < num; i++) {
            if (numArray[i] == 1) {
                score++;
                totalScore += score;
            } else {
                score = 0;

            }
        }

        return totalScore;
    }
}
