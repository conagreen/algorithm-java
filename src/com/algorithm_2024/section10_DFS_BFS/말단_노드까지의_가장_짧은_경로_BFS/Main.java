package com.algorithm_2024.section10_DFS_BFS.말단_노드까지의_가장_짧은_경로_BFS;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 인프런 - 자바 알고리즘 7-10
 * */
public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(bfs(root));
    }

    private static int bfs(Node root) {
     Queue<Node> queue = new LinkedList<>();
     queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node polled = queue.poll();
                if (polled.lt == null && polled.rt == null) {
                    return level;
                }
                queue.add(polled.lt);
                queue.add(polled.rt);
            }
            level++;
        }
        return -1;
    }
}

class Node {
    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
        this.lt = this.rt = null;
    }
}