package com.algorithm_2021_2022.section9.section9_04;

import java.util.*;

class Lecture implements Comparable<Lecture>{
    final int money;
    final int deadline;

    public Lecture(int money, int deadline) {
        this.money = money;
        this.deadline = deadline;
    }

    @Override
    public int compareTo(Lecture o) {
        if (this.deadline == o.deadline) return o.money - this.money;
        else return o.deadline - this.deadline;
    }
}

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Lecture[] lectures = new Lecture[n];
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            int d = scanner.nextInt();
            lectures[i] = new Lecture(m, d);
        }

        System.out.println(main.solution(n, lectures));
    }

    private int solution(int n, Lecture[] lectures) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(lectures);
        int day = lectures[0].deadline;
        int result = 0;
        int j = 0;

        for (int i = day; i > 0; i--) {
            for ( ; j < n; j++) {
                if (lectures[j].deadline < i) break;
                queue.add(lectures[j].money);
            }
            if (!queue.isEmpty()) result += queue.remove();
        }
        return result;
    }
}
