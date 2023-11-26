package com.algorithm_2021_2022.level_01.셀프_넘버;

public class Main {
    static int scope;
    static int[] selfNumberArray;

    public static void main(String[] args) {
        scope = 10000;
        selfNumberArray = new int[scope + 1];
        for (int i = 1; i <= scope; i++) {
            selfNumber(i);
        }

        for (int i = 1; i <= scope; i++) {
            if (selfNumberArray[i] == 0) System.out.println(i);
        }
    }

    private static void selfNumber(int x) {
        while (x <= 10000) {
            int temp = x;
            int sum = x;
            while (temp / 10 != 0 || temp % 10 != 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
            if (sum <= 10000) selfNumberArray[sum] = 1;
            x = sum;
        }
    }
}
