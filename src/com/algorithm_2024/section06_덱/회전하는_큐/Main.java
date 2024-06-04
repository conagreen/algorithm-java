package com.algorithm_2024.section06_덱.회전하는_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/*
* 백준 - 1021
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] orders = br.readLine().split(" ");
        String[] numsToInt = br.readLine().split(" ");
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= Integer.parseInt(orders[0]); i++) {
            deque.add(i);
        }
        int answer = 0;
        for (String numToInt : numsToInt) {
            ArrayDeque<Integer> temp1 = deque.clone();
            int num = Integer.parseInt(numToInt);
            int cnt1 = 0;
            while (true) {
                Integer polled = temp1.poll();
                if (num == polled) {
                    break;
                }
                temp1.add(polled);
                cnt1++;
            }

            boolean canSkip = cnt1 == 0 ? true : false;
            ArrayDeque<Integer> temp2 = deque.clone();
            int cnt2 = 0;
            while (!canSkip) {
                if (num == temp2.peek()) {
                    temp2.poll();
                    break;
                }
                temp2.addFirst(temp2.pollLast());
                cnt2++;
            }

            if (cnt1 <= cnt2) {
                deque = temp1;
                answer += cnt1;
            } else {
                deque = temp2;
                answer += cnt2;
            }
        }
        System.out.println(answer);
    }
}