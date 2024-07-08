package com.algorithm_2024.section10_DFS_BFS.이진트리_순회;

/*
 * 인프런 - 자바 알고리즘 7-5
 * */
public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        recursive(root);
    }

    private static void recursive(Node node) {
        // 전위 순회: root 먼저 방문 -> 1 2 4 5 3 6 7
        // 후위 순회: 하위 트리 모두 방문 후 root 방문 -> 4 5 2 6 7 3 1
        // 중위 순회: 왼쪽 하위 트리를 모두 방문 후 root 방문 -> 4 2 5 1 6 3 7
        if (node != null) {
            System.out.print(node.data + " "); // 방문 지점
            recursive(node.lt);
            recursive(node.rt);
        }
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