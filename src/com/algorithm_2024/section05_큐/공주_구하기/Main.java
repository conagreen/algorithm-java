package com.algorithm_2024.section05_큐.공주_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 * 인프런 - 자바 알고리즘 5-6
 * */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) queue.offer(i);

        while (queue.size() > 1) {
            for (int i = 1; i <= k; i++) {
                Integer polled = queue.poll();
                if (i != k) queue.offer(polled);
            }
        }

        System.out.println(queue.poll());
    }
}
