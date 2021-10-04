package com.algorithm.section6.section6_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[num];

        for (int i = 0; i < num; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for (int x : m.solution1(num, numbers)) {
            System.out.print(x + " ");
        }

    }

    private int[] solution1(int num, int[] numbers) {
        int idx;

        for (int i = 0; i < num-1; i++) {
            idx = i;
            for (int j = i+1; j < num; j++) {
                if (numbers[j] < numbers[idx]) idx = j;
            }
            int temp = numbers[i];
            numbers[i] = numbers[idx];
            numbers[idx] = temp;
        }

        return numbers;
    }
}
