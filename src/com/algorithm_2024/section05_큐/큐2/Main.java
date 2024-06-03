package com.algorithm_2024.section05_큐.큐2;

import java.io.*;
import java.util.ArrayDeque;

/*
 * 백준 - 18258
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
                case "pop":
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.poll()).append("\n");
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
                    break;
                case "push":
                    deque.add(Integer.parseInt(token[1]));
            }
        }
        return sb.toString();
    }
}
