package com.algorithm_2024.section09_정렬.좌표정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 인프런 - 자바 알고리즘 6-7
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Coordinate> coordinates = new ArrayList<>();
        for (int i = 0; i < n; i++) coordinates.add(new Coordinate(scanner.nextInt(), scanner.nextInt()));
        Collections.sort(coordinates);

        for (Coordinate coordinate : coordinates) {
            System.out.println(coordinate.x + " " + coordinate.y);
        }
    }
}

class Coordinate implements Comparable<Coordinate> {
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Coordinate o) {
        if (this.x == o.x) return this.y - o.y;
        return this.x - o.x;
    }
}
