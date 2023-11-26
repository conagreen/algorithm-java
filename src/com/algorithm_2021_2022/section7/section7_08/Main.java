package com.algorithm_2021_2022.section7.section7_08;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int curr = scanner.nextInt();
        int p = scanner.nextInt();

        int result = m.calculateMinNumber(curr, p);
        System.out.println(result);
    }

    private int calculateMinNumber(int curr, int p) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new LinkedHashSet<>();
        queue.add(curr);
        set.add(curr);
        int[] movement = {1, -1, 5};
        int level = 1;

        while (!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int temp = queue.remove();
                for (int j = 0; j < movement.length; j++) {
                    int x = temp + movement[j];
                    if (x == p) return level;
                    else if (!set.contains(x)) {
                        set.add(x);
                        queue.add(x);
                    }
                }
            }
            level++;
        }

        return level;
    }
}
