package com.algorithm_2021_2022.section7.section7_10;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
        lt = null;
        rt = null;
    }
}

public class Main {
    Node root;

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        int result = tree.minDistance(tree.root);
        System.out.println(result);
    }

    private int minDistance(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node curr = queue.remove();
                if (curr.lt == null && curr.rt == null) return level;
                queue.add(curr.lt);
                queue.add(curr.rt);
            }
            level++;
        }
        return level;
    }
}

