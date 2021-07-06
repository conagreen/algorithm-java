package com.algorithm.section2.section2_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        // 이중 for문으로 구현해본 코드 (당연히 시간초과)
//        System.out.println(m.solution1(num));

        // 에라토스테네스의 체 방법으로 구현한 코드
        System.out.println(m.solution2(num));

    }


    // 수학적 지식 없이 풀어보기 (당연히 시간초과)
//    private int solution1(int num) {
//        int count;
//        int result = 0;
//
//        for (int i = 2; i <= num; i++) {
//            count = 0;
//
//            for (int j = 2; j <= i; j++) {
//                if (i % j == 0) count++;
//            }
//
//            if (count < 2) result++;
//        }
//
//        return result;
//    }

    private int solution2(int num) {
        int result = 0;
        int[] intArray = new int[num + 1];

        for (int i = 2; i <= num; i++) {
            if (intArray[i] == 0) {
                result++;
                for (int j = i; j <= num; j = j + i) {
                    intArray[j] = 1;
                }
            }
        }

        return result;
    }
}
