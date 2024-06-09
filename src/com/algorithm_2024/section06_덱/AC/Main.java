package com.algorithm_2024.section06_덱.AC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 백준 - 5430
 * */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        List<ArrayDeque<String>> targets = new ArrayList<>();
        List<String> orders = new ArrayList<>();
        while (t-- > 0) {
            orders.add(br.readLine());
            br.readLine();
            String rawStr = br.readLine();
            targets.add(new ArrayDeque<>(Arrays.asList(rawStr.substring(1, rawStr.length() - 1).split(","))));
        }
        for (String answer : solution(orders, targets)) {
            System.out.println(answer);
        }
    }

    private static List<String> solution(List<String> orders, List<ArrayDeque<String>> targets) {
        List<String> answers = new ArrayList<>();
        for (int i = 0; i < orders.size(); i++) {
            boolean isReverse = false;
            boolean isError = false;
            for (char o : orders.get(i).toCharArray()) {
                if (isError) break;
                switch (o) {
                    case 'R':
                        isReverse = !isReverse;
                        break;
                    case 'D':
                        if (targets.isEmpty() || targets.get(i).isEmpty() || targets.get(i).getFirst().equals("")) {
                            answers.add("error");
                            isError = true;
                            break;
                        }

                        if (isReverse) {
                            targets.get(i).pollLast();
                            continue;
                        }
                        targets.get(i).pollFirst();
                }
            }
            if (isError) {
                continue;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            if (!isReverse) {
                for (String s : targets.get(i)) {
                    sb.append(s).append(",");
                }
            } else {
                while (!targets.get(i).isEmpty()) {
                    sb.append(targets.get(i).pollLast()).append(",");
                }
            }

            if (sb.length() > 1) sb.deleteCharAt(sb.length() - 1);
            sb.append("]");
            answers.add(sb.toString());
        }

        return answers;
    }
}
