package com.algorithm_2024.section03_연결리스트.요세푸스_문제;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

/*
 * 백준 - 1158
* */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        solution(n, k);
    }

    private static void solution(int n, int k) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("<");
        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            bw.write(queue.poll() + ", ");
        }
        bw.write(queue.poll() + ">");
        bw.flush();
        bw.close();
    }
}
