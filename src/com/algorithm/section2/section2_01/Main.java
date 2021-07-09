package com.algorithm.section2.section2_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] numArray = new int[count];

        for (int i = 0; i < count; i++) {
            numArray[i] = scanner.nextInt();
        }

        for (int result : m.solution(count, numArray)) {
            System.out.print(result + " ");
        }
    }


    public List<Integer> solution(int count, int[] numArray) {
    List<Integer> resultList = new ArrayList<>();
        resultList.add(numArray[0]);

        for (int i = 1; i < count; i++) {
            if (numArray[i] > numArray[i-1]) resultList.add(numArray[i]);
        }

        return resultList;
    }
}
