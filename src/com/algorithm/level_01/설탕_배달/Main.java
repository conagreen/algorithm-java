package com.algorithm.level_01.설탕_배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // BFS 방식 (메모리 초과)
//        int result = main.BFS(n);
        int result = main.solution(n);
        System.out.println(result);
    }

    private int solution(int n) {
        int count = 0;
        if (n % 5 == 0) return n / 5;
        while (n >= 0) {
            n -= 3;
            count++;
            if (n % 5 == 0) return (n / 5) + count;
            else if (n == 0) return count;
        }
        return -1;
    }

    // BFS 방식 (메모리 초과)
//    private int BFS(int n) {
//        Integer[] packs = {3, 5};
//        Queue<Integer> queue = new LinkedList<>(Arrays.asList(packs));
//        int count = 0;
//
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            count++;
//            for (int i = 0; i < size; i++) {
//                Integer removed = queue.remove();
//                if (removed == n) return count;
//                for (int pack : packs) {
//                    int curr = removed + pack;
//                    if (curr <= n) queue.add(curr);
//                }
//            }
//        }
//
//        return -1;
//    }
}
