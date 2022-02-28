package com.algorithm.section9.section9_02;

import java.util.Arrays;
import java.util.Scanner;

class Meeting implements Comparable<Meeting>{
    final int startTime;
    final int endTime;

    public Meeting(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int compareTo(Meeting o) {
        if (this.endTime == o.endTime) return this.startTime - o.startTime;
        else return this.endTime - o.endTime;
    }
}

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Meeting[] meetings = new Meeting[n];

        for (int i = 0; i < n; i++) {
            int startTime = scanner.nextInt();
            int endTime = scanner.nextInt();
            meetings[i] = new Meeting(startTime, endTime);
        }

        System.out.println(main.solution(meetings));
    }

    private int solution(Meeting[] meetings) {
        Arrays.sort(meetings);
        int curEndTime = 0;
        int result = 0;

        for (Meeting meeting : meetings) {
            if (meeting.startTime >= curEndTime) {
                curEndTime = meeting.endTime;
                result++;
            }
        }

        return result;
    }
}
