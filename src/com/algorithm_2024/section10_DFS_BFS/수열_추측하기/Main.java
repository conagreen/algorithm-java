package com.algorithm_2024.section10_DFS_BFS.수열_추측하기;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 8-8
 * */
public class Main {
    static int n, target;
    static Integer[] candidate;
    static int[] check;
    static Integer[] answer;
    static boolean hasAnswer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hasAnswer = false;
        n = scanner.nextInt();
        target = scanner.nextInt();
        candidate = new Integer[n];
        check = new int[n + 1];
        dfs(0);

        for (Integer x : answer) {
            System.out.print(x + " ");
        }
    }

    private static void dfs(int level) {
        if (hasAnswer) return;
        if (level == n) {
            solution(candidate);
        } else {
            for (int i = 1; i <= n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    candidate[level] = i;
                    dfs(level + 1);
                    check[i] = 0;
                }
            }
        }
    }

    private static void solution(Integer[] candidate) {
        if (hasAnswer) return;

        Queue<Integer> queue = new LinkedList<>(Arrays.asList(candidate));
        int len = n;

        while (queue.size() > 1) {
            for (int i = 0; i < len; i++) {
                if (i == len - 1) {
                    queue.poll();
                } else {
                    queue.add(queue.poll() + queue.peek());
                }
            }
            len--;
        }

        if (queue.peek() == target) {
            answer = candidate.clone();
            hasAnswer = true;
        }
    }
}