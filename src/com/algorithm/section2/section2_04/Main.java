package com.algorithm.section2.section2_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        // 배열 사용하지 않고 구현해보자 (노가다..)
//        m.solution1(num);

        m.solution2(num);

    }

    // 배열 사용하지 않고 구현해보자 (노가다..)
//    private void solution1(int num) {
//        int first = 1;
//        int second = 1;
//        int result;
//
//        System.out.print(first + " " + second + " ");
//
//        for (int i = 2; i < num; i++) {
//            result = first + second;
//            System.out.print(result + " ");
//            first = second;
//            second = result;
//        }
//    }

    private void solution2(int num) {
        int[] result = new int[num];
        result[0] = 1;
        result[1] = 1;

        for (int i = 0; i < num; i++) {
            if (i < 2) System.out.print(result[i] + " ");
            else {
                result[i] = result[i-2] + result[i-1];
                System.out.print(result[i] + " ");
            }
        }
    }
}
