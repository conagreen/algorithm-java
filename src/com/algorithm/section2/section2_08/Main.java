package com.algorithm.section2.section2_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 처리 속도 비교:
* solution1 방식 평균 속도 - 100ms
* solution2 방식 평균 속도 - 97ms
*
* 결론: 속도 차이도 미세하지만 solution2 방식이 빠르고, 코드도 solution1 보다 간결하고 가독성이 더 좋다.
* */

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scores = new int[num];

        for (int i = 0; i < num; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        // max(최대점수)를 기준으로 구현한 코드
//        for (int score : m.solution1(num, scores)) {
//            System.out.print(score + " ");
//        }

        // 학생의 점수 자체를 기준으로 구현한 코드
        for (int score : m.solution2(num, scores)) {
            System.out.print(score + " ");
        }
    }

    // max(최대점수)를 기준으로 구현한 코드
//    public int[] solution1(int num, int[] scores) {
//        int count = 0;
//        int[] grades = new int[num];
//        int max = 0;
//
//        for (int i = 0; i < num; i+=count) {
//            max = 0;
//            count = 0;
//            for (int j = 0; j < num; j++) {
//                if (grades[j] == 0 && scores[j] > max) {
//                    max = scores[j];
//                }
//            }
//
//            for (int j = 0; j < num; j++) {
//                if (scores[j] == max) {
//                    grades[j] = i+1;
//                    count++;
//                }
//            }
//        }
//
//        return grades;
//    }

    // 학생의 점수 자체를 기준으로 구현한 코드
    private int[] solution2(int num, int[] scores) {
        int rank;
        int[] grades = new int[num];

        for (int i = 0; i < num; i++) {
            rank = 1;
            for (int j = 0; j < num; j++) {
                if (scores[i] < scores[j]) rank++;
            }

            grades[i] = rank;
        }

        return grades;
    }
}
