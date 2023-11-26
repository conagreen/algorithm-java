package com.algorithm_2021_2022.section7.section7_09;

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

        int result = tree.minDistance(tree.root, 0);
        System.out.println(result);
    }

    private int minDistance(Node root, int level) {
        if (root.lt == null && root.rt == null) return level;
        else return Math.min(minDistance(root.lt, level + 1), minDistance(root.rt, level + 1));
    }
}
