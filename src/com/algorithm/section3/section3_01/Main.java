package com.algorithm.section3.section3_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Main m = new Main();

        int num1 = Integer.parseInt(br.readLine());
        int[] numArray1 = m.readNumbers(num1);

        int num2 = Integer.parseInt(br.readLine());
        int[] numArray2 = m.readNumbers(num2);

        for (int x : m.solution(num1, numArray1, num2, numArray2)) {
            System.out.print(x + " ");
        }

    }

    private int[] readNumbers(int num) throws IOException {
        int[] numArray = new int[num + 1];

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            numArray[i] = Integer.parseInt(st.nextToken());
        }

        return numArray;
    }

    private List<Integer> solution(int num1, int[] numArray1, int num2, int[] numArray2) {
        List<Integer> result = new ArrayList<>();
        int pointer1 = 0, pointer2 = 0;

        while (numArray1[pointer1] != 0 || numArray2[pointer2] != 0) {
            if (numArray1[pointer1] <= numArray2[pointer2] && numArray1[pointer1] != 0) {
                result.add(numArray1[pointer1++]);
            } else if (numArray2[pointer2] < numArray1[pointer1] && numArray2[pointer2] != 0) {
                result.add(numArray2[pointer2++]);
            }

            if (numArray1[pointer1] == 0) {
                result.add(numArray2[pointer2++]);
            } else if (numArray2[pointer2] == 0) {
                result.add(numArray1[pointer1++]);
            }

        }

        return result;
    }
}