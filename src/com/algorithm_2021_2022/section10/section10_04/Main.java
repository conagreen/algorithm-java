package com.algorithm_2021_2022.section10.section10_04;

import java.util.Arrays;
import java.util.Scanner;

class Brick implements Comparable<Brick> {
    int area;
    int height;
    int weight;

    public Brick(int area, int height, int weight) {
        this.area = area;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick o) {
        return o.area - this.area;
    }

    @Override
    public String toString() {
        return this.area + " " + this.height + " " + this.weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Brick[] arr = new Brick[n];

        for (int i = 0; i < n; i++) {
            int area = scanner.nextInt();
            int height = scanner.nextInt();
            int weight = scanner.nextInt();
            arr[i] = new Brick(area, height, weight);
        }

        System.out.println(main.solution(arr));
    }

    private int solution(Brick[] arr) {
        Arrays.sort(arr);
        int[] dy = new int[arr.length];
        dy[0] = arr[0].height;
        int result = dy[0];

        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i-1; j >= 0; j--) {
                if (arr[j].weight > arr[i].weight && dy[j] > max) {
                    max = dy[j];
                }
            }
            dy[i] = max + arr[i].height;
            result = Math.max(result, dy[i]);
        }

        return result;
    }
}
