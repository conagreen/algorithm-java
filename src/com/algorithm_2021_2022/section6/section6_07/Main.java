package com.algorithm_2021_2022.section6.section6_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = m.readNumber(br);
        List<Coordinate> coordinates = m.readCoordinate(br, num);

        List<Coordinate> result = m.solution(num, coordinates);

        for (Coordinate coordinate : result) {
            System.out.println(coordinate.x + " " + coordinate.y);
        }
    }

    private int readNumber(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }

    private List<Coordinate> readCoordinate(BufferedReader br, int num) throws IOException {
        List<Coordinate> coordinates  = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            coordinates.add(new Coordinate(x, y));
        }

        return coordinates;
    }

    private List<Coordinate> solution(int num, List<Coordinate> list) {
        Collections.sort(list);

        return list;
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
        else return this.x - o.x;
    }
}
