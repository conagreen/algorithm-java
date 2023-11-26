package com.algorithm_2021_2022.section3.section3_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final Main m = new Main();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int[] days = new int[num1];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num1; i++) {
            days[i] = Integer.parseInt(st.nextToken());
        }

        // 2중 for문으로 하나하나 계산하는 코드
//        System.out.println(m.solution1(num1, num2, days));

        // 슬라이딩 윈도우 방식으로 구현 ( solution1 방식에 비해 3분의 2정도 시간 단축 )
        System.out.println(m.solution2(num1, num2, days));

    }

//    public int solution1(int num1, int num2, int[] days) {
//        int range = num1 - num2;
//        int sum;
//        int result = 0;
//
//        for (int i = 0; i <= range; i++) {
//            sum = 0;
//            for (int j = 0; j < num2; j++) {
//                sum += days[i+j];
//            }
//            if (sum > result) result = sum;
//        }
//
//        return result;
//    }

    public int solution2(int num1, int num2, int[] days) {
        int result, sum = 0;

        for (int i = 0; i < num2; i++) {
            sum += days[i];
        }

        result = sum;

        for (int i = num2; i < num1; i++) {
            sum += (days[i] - days[i-num2]);
            if (sum > result) result = sum;
        }

        return result;
    }
}
