package com.algorithm_2024.section10_DFS_BFS.동전교환;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 8-5
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        Integer[] coins = new Integer[cnt];

        for (int i = 0; i < cnt; i++) {
            coins[i] = scanner.nextInt();
        }

        int change = scanner.nextInt();
        System.out.println(bfs(coins, change));
    }

    private static int bfs(Integer[] coins, int change) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(coins));
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer polled = queue.poll();
                if (polled == change) return level;

                for (Integer coin : coins) {
                    queue.add(polled + coin);
                }
            }
            level++;
        }

        return -1;
    }
}