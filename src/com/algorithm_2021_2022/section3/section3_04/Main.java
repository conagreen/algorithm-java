package com.algorithm_2021_2022.section3.section3_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        final Main m = new Main();
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int[] numArray = new int[num+1];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            numArray[i] = Integer.parseInt(st.nextToken());
        }

        // 2중 for문으로 구현
//        System.out.println(m.solution1(num, target, numArray));

        // two pointers 방식으로 구현
        System.out.println(m.solution2(num, target, numArray));

    }


    // 2중 for문으로 구현
//    private int solution1(int num, int target, int[] numArray) {
//        int sum, result = 0;
//
//        for (int i = 0; i < num; i++) {
//            sum = 0;
//            for (int j = i; j < num; j++) {
//                sum += numArray[j];
//                if (sum == target) {
//                    result++;
//                    break;
//                } else if (sum > target) {
//                    break;
//                }
//            }
//        }
//
//        return result;
//    }


    // two pointers 방식으로 구현
    private int solution2(int num, int target, int[] numArray) {
        int result = 0;
        int left = 0, right = 0;
        int sum = numArray[right];

        while (right < num) {
            if (sum == target) {
                result++;
                sum -= numArray[left];
                left++;
            } else if (sum < target) {
                right++;
                sum += numArray[right];
            } else {
                sum -= numArray[left];
                left++;
            }
        }

        return result;
    }
}
