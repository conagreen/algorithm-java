package com.algorithm_2021_2022.section6.section6_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = m.readNumber(st);
        int target = m.readTarget(st);
        int[] arr = m.readArray(num, br);

        int p = m.solution(target, arr);

        System.out.println(p);
    }

    private int[] readArray(int num, BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        return arr;
    }

    private int readTarget(StringTokenizer st) {
        return Integer.parseInt(st.nextToken());
    }

    private int readNumber(StringTokenizer st) {
        return Integer.parseInt(st.nextToken());
    }

    private int solution(int target, int[] arr) {
        int lt = 0, rt = arr.length-1;
        Arrays.sort(arr);
        int result = 0;

        while (lt < rt) {
            int p = (lt + rt) / 2;
            if (arr[p] > target) rt = p;
            else if (arr[p] < target) lt = p;
            else {
                result = p+1;
                break;
            };
        }

        return result;
    }
}