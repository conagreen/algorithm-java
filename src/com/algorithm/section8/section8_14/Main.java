package com.algorithm.section8.section8_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Point {
    int low;
    int col;

    public Point(int low, int col) {
        this.low = low;
        this.col = col;
    }
}

public class Main {
    static List<Point> houses = new ArrayList<>();
    static List<Point> pizza = new ArrayList<>();
    static int[] comb;
    static int n, m, result = Integer.MAX_VALUE;;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        comb = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = scanner.nextInt();
                if (temp == 1) houses.add(new Point(i, j));
                if (temp == 2) pizza.add(new Point(i, j));
            }
        }

        main.DFS(0, 0);
        System.out.println(result);
    }

    private void DFS(int L, int V) {
        if (L == m) {
            int sum = 0;
            for (Point house : houses) {
                int dis = Integer.MAX_VALUE;
                for (int x : comb) {
                    dis = Math.min(dis, Math.abs(house.low - pizza.get(x).low) + Math.abs(house.col - pizza.get(x).col));
                }
                sum += dis;
            }
            result = Math.min(result, sum);
        } else {
            for (int i = V; i < pizza.size(); i++) {
                comb[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
}
