package com.algorithm_2024.section05_큐.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준 - 10845
 * */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] orders = new String[n];
        for (int i = 0; i < n; i++) {
           orders[i] = br.readLine();
        }
        solution(orders);
    }

    private static void solution(String[] orders) {
        int[] arr = new int[10001];
        int lt = 0;
        int rt = 0;

        for (int i = 0; i < orders.length; i++) {
            String[] order = orders[i].split(" ");
            switch (order[0]) {
                case "pop":
                    if (arr[lt] == 0) System.out.println(-1);
                    else {
                        System.out.println(arr[lt]);
                        arr[lt] = 0;
                        if (lt < rt) lt++;
                    }
                    break;
                case "size":
                    System.out.println(rt - lt);
                    break;
                case "empty":
                    if (arr[lt] == 0) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "front":
                    if (arr[lt] == 0) System.out.println(-1);
                    else System.out.println(arr[lt]);
                    break;
                case "back":
                    if (rt == 0 || arr[rt - 1] == 0) System.out.println(-1);
                    else System.out.println(arr[rt-1]);
                    break;
                case "push":
                    arr[rt++] = Integer.parseInt(order[1]);
                    break;
            }
        }
    }
}
