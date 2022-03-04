package com.algorithm.section9.section9_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Time implements Comparable<Time> {
    final int time;
    final char state;

    public Time(int time, char status) {
        this.time = time;
        this.state = status;
    }

    @Override
    public int compareTo(Time o) {
        if (this.time == o.time) return o.state - this.state;
        else return this.time - o.time;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Time[] times = new Time[n+n];

        for (int i = 0; i < times.length; i+=2) {
            st = new StringTokenizer(br.readLine());
            int arrivalTime = Integer.parseInt(st.nextToken());
            int departureTime = Integer.parseInt(st.nextToken());
            times[i] = new Time(arrivalTime, 'a');
            times[i+1] = new Time(departureTime, 'd');
        }

        System.out.println(main.solution(times));
    }

    private int solution(Time[] times) {
        Arrays.sort(times);
        int cnt = 0;
        int max = Integer.MIN_VALUE;

        for (Time time : times) {
            if (time.state == 'd') cnt--;
            else max = Math.max(max, ++cnt);
        }

        return max;
    }
}
