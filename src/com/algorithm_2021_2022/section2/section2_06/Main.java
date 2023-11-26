package com.algorithm_2021_2022.section2.section2_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[] intArray = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
             intArray[i] = Integer.parseInt(st.nextToken());
        }

        m.solution(num, intArray);
    }

    public void solution(int num, int[] intArray) {
        for (int i = 0; i < num; i++) {
            int temp = intArray[i];
            int result = 0;
            while (temp > 0) {
                result = (result * 10) + (temp % 10);
                temp = temp / 10;
            }

            if (isPrimeNumber(result) && result > 1) {
                System.out.print(result + " ");
            }
        }
    }

    // 소수인지 확인하는 메서드
    public boolean isPrimeNumber(int num) {

        // 더 간결하고 명료하게 구현한 코드
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;

        // 하나씩 체크하며 구현한 코드
//        int[] numArray = new int[num+1];
//
//        outerLoop:
//        for (int i = 2; i < num; i++){
//            if (numArray[i] == 0) {
//                for (int j = i; j <= num; j = j + i) {
//                    numArray[j] = 1;
//                    if (numArray[num] == 1) break outerLoop;
//                }
//            }
//        }
//        return numArray[num] == 0;
    }

}