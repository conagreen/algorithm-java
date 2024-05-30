package com.algorithm_2024.section04_스택.탑;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
* 백준 - 2493
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new Node(Integer.parseInt(input[i]), i + 1));
        }

        List<Integer> answers = solution(nodes);
        StringJoiner sj = new StringJoiner(" ");
        for (int answer : answers) {
            sj.add(Integer.toString(answer));
        }
        System.out.print(sj);
    }

    private static List<Integer> solution(List<Node> nodes) {
        Stack<Node> stack = new Stack<>();
        List<Integer> answer = new ArrayList<>();

        for (Node node : nodes) {
            while (true) {
                if (stack.isEmpty()) {
                    stack.push(node);
                    answer.add(0);
                    break;
                }

                if (stack.peek().height <= node.height) {
                    stack.pop();
                } else {
                    answer.add(stack.peek().index);
                    stack.add(node);
                    break;
                }
            }
        }

        return answer;
    }
}

class Node {
    int height;
    int index;

    public Node(int height, int index) {
        this.height = height;
        this.index = index;
    }
}
