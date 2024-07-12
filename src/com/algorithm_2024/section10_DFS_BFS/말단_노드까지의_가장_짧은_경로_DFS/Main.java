package com.algorithm_2024.section10_DFS_BFS.말단_노드까지의_가장_짧은_경로_DFS;

/*
 * 인프런 - 자바 알고리즘 7-9
 * */
public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        System.out.println(dfs(root, 0));
    }

    private static int dfs(Node node, int level) {
        if (node.lt == null && node.rt == null) return level;
        else return Math.min(dfs(node.lt, level + 1), dfs(node.rt, level + 1));
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