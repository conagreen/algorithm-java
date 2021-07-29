package com.algorithm.section5.section5_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        System.out.println(main.solution(num, target));
    }

    private int solution(int num, int target) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= num; i++) queue.offer(i);

        while (queue.size() > 1) {
            for (int i = 1; i < target; i++) queue.offer(queue.poll());
            queue.poll();
        }

        return queue.poll();
    }
}
