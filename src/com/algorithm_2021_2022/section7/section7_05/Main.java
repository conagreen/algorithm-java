package com.algorithm_2021_2022.section7.section7_05;

/**
 * 1부터 7까지의 data를 가진 이진트리 구조의 노드를 전위순회 & 중위순회 & 후위순회로 출력해보는 연습 코드
 *
 * 전위순회 출력: 1 2 4 5 3 6 7
 * 전위순회 출력: 4 2 5 1 6 3 7
 * 전위순회 출력: 4 5 2 6 7 3 1
 */
class Node {
    int data;
    Node lt, rt;

    public Node(int node) {
        this.data = node;
        lt = rt = null;
    }
}

public class Main {
    Node root;

    private void DFS(Node root) {
        if (root == null) return;
        else {
            // 전위순회 출력 (중위순회와 후위순회는 해당코드에서 프린트하는 위치만 달라진다.)
            System.out.print(root.data + " ");
            DFS(root.lt);
            DFS(root.rt);
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
