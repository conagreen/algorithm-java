package com.algorithm.section2.section2_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* solution1 :평균 속도 - 94ms, 메모리 - 27MB
* solution2 : 평균 속도 - 104ms, 메모리 - 27MB
* */
public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[][] numArray = new int[num][num];

        StringTokenizer st;

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <num; j++) {
                numArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // Math 이용하지 않고 + 변수 하나로(행, 열, 대각선) 구현
//        System.out.println(m.solution1(num, numArray));

        // Math 이용해서 + 각 변수(행, 열, 대각선) 생성해서 구현
        System.out.println(m.solution2(num, numArray));
    }

    // Math 이용하지 않고 + 변수 하나로(행, 열, 대각선) 구현
//    private int solution1(int num, int[][] numArray) {
//        int numTotal = (num*2)+2;
//        int[] sumArray = new int[numTotal];
//        int max = 0;
//
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//                sumArray[i] += numArray[i][j];
//                sumArray[i + num] += numArray[j][i];
//                if (sumArray[i] > max) max = sumArray[i];
//                if (sumArray[i + num] > max) max = sumArray[i + num];
//            }
//            sumArray[(num*2)] += numArray[i][i];
//            sumArray[(num*2)+1] += numArray[num-i-1][i];
//            if (sumArray[(num*2)] > max) max = sumArray[(num*2)];
//            if (sumArray[(num*2)+1] > max) max = sumArray[(num*2)+1];
//        }
//
//        return max;
//    }

    // Math 이용해서 + 각 변수(행, 열, 대각선) 생성해서 구현
    private int solution2(int num, int[][] numArray) {
        int[] rowSum = new int[num];
        int[] columnSum = new int[num];
        int[] diagonalSum = new int[2];
        int maxNum = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                rowSum[i] += numArray[i][j];
                columnSum[i] += numArray[j][i];
                maxNum = Math.max(rowSum[i], maxNum);
                maxNum = Math.max(columnSum[i], maxNum);
            }
            diagonalSum[0] += numArray[i][i];
            diagonalSum[1] += numArray[num-i-1][i];
        }

        maxNum = Math.max(diagonalSum[0], maxNum);
        maxNum = Math.max(diagonalSum[1], maxNum);

        return maxNum;
    }
}

