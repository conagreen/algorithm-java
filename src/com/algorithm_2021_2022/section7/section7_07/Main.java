package com.algorithm_2021_2022.section7.section7_07;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 2레벨까지 있는 이진트리를 BFS방식으로 순회하며 출력하기
 * 출력결과 : 1 2 3 4 5 6 7
 */
class Node {
    int data;
    Node lt;
    Node rt;

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
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.solution(tree.root);
    }

    private void solution(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        BFS(queue);

    }

    private void BFS(Queue<Node> queue) {
        if (queue.isEmpty()) {
            return;
        } else {
            Node curr = queue.remove();
            System.out.print(curr.data + " ");
            if (curr.lt != null) queue.add(curr.lt);
            if (curr.rt != null) queue.add(curr.rt);
            BFS(queue);
        }
    }
}
