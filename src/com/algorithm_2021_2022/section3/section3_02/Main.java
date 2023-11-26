package com.algorithm_2021_2022.section3.section3_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Main m = new Main();

        int num1 = Integer.parseInt(br.readLine());
        int[] numArray1 = m.readNumbers(num1);

        int num2 = Integer.parseInt(br.readLine());
        int[] numArray2 = m.readNumbers(num2);

        for (int result : m.solution(num1, numArray1, num2, numArray2)) {
            System.out.print(result + " ");
        }

    }

    private int[] readNumbers(int num) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numArray = new int[num];

        for (int i = 0; i < num; i++) {
            numArray[i] = Integer.parseInt(st.nextToken());
        }

        return numArray;
    }

    private List<Integer> solution(int num1, int[] numArray1, int num2, int[] numArray2) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(numArray1);
        Arrays.sort(numArray2);
        int p1 = 0, p2 = 0;

        while (p1 < num1 && p2 < num2) {
            if (numArray1[p1] == numArray2[p2]) {
                result.add(numArray1[p1++]);
                p2++;
            } else if (numArray1[p1] < numArray2[p2]){
                p1++;
            } else {
                p2++;
            }
        }

        return result;
    }
}
