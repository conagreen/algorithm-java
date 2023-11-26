package com.algorithm_2021_2022.section2.section2_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int[][] numArray = new int[num + 2][num + 2];

        for (int i = 1; i < num + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < num + 1; j++) {
                numArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // Math 이용해서 구현한 코드
//        System.out.println(m.solution1(num, numArray));

        // Math 사용하지 않고 if문으로만 구현
//        System.out.println(m.solution2(num, numArray));

        // 3중 for문으로 구현
        System.out.println(m.solution3(num, numArray));
    }


    // Math 이용해서 구현한 코드
//    private int solution1(int num, int[][] numArray) {
//
//        int result = 0;
//        int max = 0;
//
//        for (int i = 1; i < num+1; i++) {
//            for (int j = 1; j < num+1; j++) {
//                max = Math.max(numArray[i-1][j], max);
//                max = Math.max(numArray[i+1][j], max);
//                max = Math.max(numArray[i][j-1], max);
//                max = Math.max(numArray[i][j+1], max);
//
//                if (numArray[i][j] > max) {
//                    result++;
//                    j++;
//                }
//                max = 0;
//            }
//        }
//
//        return result;
//    }


    // Math 사용하지 않고 if문으로만 구현
//    private int solution2(int num, int[][] numArray) {
//
//        int result = 0;
//
//        for (int i = 1; i < num + 1; i++) {
//            for (int j = 1; j < num + 1; j++) {
//                if (numArray[i][j] > numArray[i-1][j] && numArray[i][j] > numArray[i+1][j])
//                    if (numArray[i][j] > numArray[i][j-1] && numArray[i][j] > numArray[i][j+1]) {
//                        result++;
//                        j++;
//                    }
//            }
//        }
//
//        return result;

//    }


    // 3중 for문으로 구현
    private int solution3(int num, int[][] numArray) {

        int[] x = {-1, 0, 1, 0};
        int[] y = {0, 1, 0, -1};
        boolean peak;
        int result = 0;

        for (int i = 1; i < num+1; i++) {
            for (int j = 1; j < num+1; j++) {
                peak = true;
                for (int k = 0; k < 4; k++) {
                    if (numArray[i + x[k]][j + y[k]] >= numArray[i][j]) {
                        peak = false;
                        break;
                    }
                }
                if (peak) {
                    result++;
                    j++;
                }
            }
        }
        return result;
    }

}

