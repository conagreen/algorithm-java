package com.algorithm.section8.section8_05;

import java.util.*;

class Coin {
    int value;

    public Coin(int value) {
        this.value = value;
    }
}

public class Main {
    static int num;
    static Coin[] coins;
    static int change;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();
        coins = new Coin[num];
        for (int i = 0; i < num; i++) {
            coins[i] = new Coin(scanner.nextInt());
        }
        change = scanner.nextInt();

        System.out.println(main.BFS());
    }

    private int BFS() {
        Queue<Coin> queue = new LinkedList<>(Arrays.asList(coins));
        int count = 1;
        int[] check = new int[change+1];

        while (!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int curr = queue.remove().value;
                if (curr == change) return count;
                for (int j = 0; j < num; j++) {
                    int next = curr + coins[j].value;
                    if (next <= change && check[next] == 0) {
                        check[next] = 1;
                        queue.add(new Coin(next));
                    }
                }
            }
            count++;
        }

        return -1;
    }
}
