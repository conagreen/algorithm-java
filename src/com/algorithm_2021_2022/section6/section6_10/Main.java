package com.algorithm_2021_2022.section6.section6_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] array = main.readArray(n, br);

        final int result = main.solution(n, m, array);

        System.out.println(result);

    }

    private int solution(int n, int m, int[] array) {
        Arrays.sort(array);
        int result = 0;
        int lt = array[1] - array[0];
        int rt = array[n-1] - array[0];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (getCount(mid, array) < m) {
                rt = mid - 1;
            } else {
                result = mid;
                lt = mid + 1;
            }
        }

        return result;
    }

    private int getCount(int mid, int[]array) {
        int count = 1;
        int temp = array[0];
        int len = array.length;

        for (int i = 1; i < len; i++) {
            if (array[i] - temp >= mid) {
                temp = array[i];
                count++;
            }
        }

        return count;
    }

    private int[] readArray(int n, BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        return array;
    }
}
