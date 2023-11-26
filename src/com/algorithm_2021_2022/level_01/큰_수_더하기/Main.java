package com.algorithm_2021_2022.level_01.큰_수_더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] array1 = st.nextToken().split("");
        String[] array2 = st.nextToken().split("");
        String result = solution(array1, array2);
        System.out.println(result);
    }

    private static String solution(String[] array1, String[] array2) {
        int len = Math.max(array1.length, array2.length);
        int[] A = new int[len+1];
        int[] B = new int[len+1];
        int[] temp = new int[len+1];
        StringBuilder result = new StringBuilder();

        for (int i = len, j = array1.length-1; j >= 0; i--, j--) {
            A[i] = Integer.parseInt(array1[j]);
        }

        for (int i = len, j = array2.length-1; j >= 0; i--, j--) {
            B[i] = Integer.parseInt(array2[j]);
        }

        for (int i = len; i >= 0; i--) {
            int sum = A[i] + B[i];
            temp[i] = sum % 10;
            if (sum/10 > 0) A[i-1]++;
        }

        for (int i = 0; i <= len; i++) {
            if (i == 0 && temp[i] == 0) continue;
            result.append(temp[i]);
        }

        return result.toString();
    }
}
