package com.algorithm_2021_2022.section9.section9_01;

import java.util.Arrays;
import java.util.Scanner;

class Candidate implements Comparable<Candidate>{
    private final int height;
    private final int weight;

    public Candidate(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Candidate another) {
        return another.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Candidate[] candidates = new Candidate[n];

        for (int i = 0; i < n; i++) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            candidates[i] = new Candidate(h, w);
        }

        System.out.println(main.solution(candidates));
    }

    private int solution(Candidate[] candidates) {
        int result = 0;
        int max = Integer.MIN_VALUE;
        Arrays.sort(candidates);

        for (Candidate candidate : candidates) {
            int curWeight = candidate.getWeight();
            if (curWeight > max) {
                result++;
                max = curWeight;
            }
        }

        return result;
    }
}
