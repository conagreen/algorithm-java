package com.algorithm_2021_2022.section10.section10_03;

import java.util.Scanner;

public class Main {
    int n;
    int[] arr;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        main.n = scanner.nextInt();
        main.arr = new int[main.n+1];
        for (int i = 0; i < main.n; i++) {
            main.arr[i] = scanner.nextInt();
        }

        System.out.println(main.solution());
    }

    private int solution() {
        int[] dy = new int[n+1];
        dy[0] = 1;
        int result = 0;

        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i-1; j >= 0; j--) {
                if (arr[i] > arr[j] && dy[j] > max) max = dy[j];
            }
            dy[i] = max+1;
            result = Math.max(result, dy[i]);
        }

        return result;
    }
}
