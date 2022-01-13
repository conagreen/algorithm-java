package com.algorithm.section6.section6_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int x : m.indexOfUnsortedNumber(num, arr)) {
            System.out.print(x + " ");
        }
    }

    private int[] indexOfUnsortedNumber(int num, int[] arr) {
        int[] result = new int[2];

        for (int i = 0; i < num-1; i++) {
            if (arr[i] > arr[i+1]) {
                while (arr[i] == arr[i-1]) {
                    i--;
                }
                result[0] = i+1;
                break;
            }
        }

        for (int i = result[0]; i < num; i++) {
            if (arr[i] < arr[i-1]) {
                result[1] = i+1;
            }
        }

        return result;
    }
}
