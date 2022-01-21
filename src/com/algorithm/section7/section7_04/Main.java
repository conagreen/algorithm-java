package com.algorithm.section7.section7_04;

import java.util.*;

public class Main {

    static int[] result;

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        result = new int[num+1];

        m.recursive(num);

        for (int i = 1; i <= num; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private int recursive(int num) {
        if (result[num] > 0) return result[num];
        else if (num == 1) return result[num] = 1;
        else if (num == 2) return result[num] = 1;
        else return result[num] = recursive(num - 2) + recursive(num - 1);
    }
}