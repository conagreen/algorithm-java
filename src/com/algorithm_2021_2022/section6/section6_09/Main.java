package com.algorithm_2021_2022.section6.section6_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int songCount = m.readSongCount(st);
        final int dvdCount = m.readDvdCount(st);
        final int[] songArrays = m.readSongArrays(songCount, br);

        final int result = m.solution(dvdCount, songArrays);

        System.out.println(result);

    }

    private int solution(int dvdCount, int[] songArrays) {
        int result = 0;
        int lt = Arrays.stream(songArrays).max().getAsInt();
        int rt = Arrays.stream(songArrays).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (getCount(mid, songArrays) > dvdCount) {
                lt = mid+1;
            } else {
                result = mid;
                rt = mid-1;
            }
        }

        return result;
    }

    private int getCount(int mid, int[] songArrays) {
        int sum = 0;
        int count = 1;

        for (int x : songArrays) {
            if (sum + x > mid) {
                sum = x;
                count++;
            } else {
                sum += x;
            }
        }

        return count;
    }

    private int[] readSongArrays(int songCount, BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] songArrays = new int[songCount];

        for (int i = 0; i < songCount; i++) {
            songArrays[i] = Integer.parseInt(st.nextToken());
        }

        return songArrays;
    }

    private int readDvdCount(StringTokenizer st) {
        return Integer.parseInt(st.nextToken());
    }

    private int readSongCount(StringTokenizer st) {
        return Integer.parseInt(st.nextToken());
    }
}
