package com.algorithm_2021_2022.section2.section2_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] classes = new int[num+1][5];

        StringTokenizer st;

        for (int i = 1; i < num+1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                classes[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(m.solution(num, classes));

    }

    private int solution(int num, int[][] classes) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        int result = 1;

        for (int i = 1; i < num+1; i++) {
            count = 0;
            for (int j = 1; j < num+1; j++) {
                for (int k = 0; k < 5; k++) {
                    if (classes[i][k] == classes[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;
                result = i;
            }
        }

        return result;
    }
}
