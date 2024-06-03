package com.algorithm_2024.section06_덱.덱;

import java.io.*;
import java.util.ArrayDeque;

/*
* 백준 - 10866
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] orders = new String[n];
        for (int i = 0; i < n; i++) {
            orders[i] = br.readLine();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(solution(orders));
        bw.flush();
        bw.close();
    }

    private static String solution(String[] orders) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (String order : orders) {
            String[] token = order.split(" ");
            switch (token[0]) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(token[1]));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(token[1]));
                    break;
                case "pop_front":
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    if (deque.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front":
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.getFirst()).append("\n");
                    break;
                case "back":
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.getLast()).append("\n");
            }
        }
        return sb.toString();
    }
}
