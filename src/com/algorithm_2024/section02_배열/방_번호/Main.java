package com.algorithm_2024.section02_배열.방_번호;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
* 백준 - 1475
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String roomNumber = scanner.next();
        System.out.println(count(roomNumber));
    }

    private static int count(String roomNumber) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (String token : roomNumber.split("")) {
            int num = parseInt(token);
            map.put(num, map.getOrDefault((num), 0) + 1);
            if ((num == 6 || num == 9)) {
                int sum = (map.getOrDefault(6, 0) + map.getOrDefault(9, 0)) / 2;
                sum = (map.getOrDefault(6, 0) + map.getOrDefault(9, 0)) % 2 == 0 ? sum : sum + 1;
                if (sum > max) max = sum;
            } else if (map.get(num) > max) {
                max = map.get(num);
            }
        }
        return max;
    }
}
