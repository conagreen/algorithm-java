package com.algorithm_2024.section05_큐.응급실;

import java.util.*;

/*
 * 인프런 - 자바 알고리즘 5-8
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int target = sc.nextInt();
        Queue<Patient> patients = new LinkedList<>();
        for (int i = 0; i < total; i++) patients.offer(new Patient(i, sc.nextInt()));
        int cnt = 1;
        while (!patients.isEmpty()) {
            Patient firstPatient = patients.poll();
            boolean hasHighestLevel = true;
            for (Patient another : patients) {
                if (another.hasHigherLevelThan(firstPatient)) {
                    patients.offer(firstPatient);
                    hasHighestLevel = false;
                    break;
                }
            }

            if (hasHighestLevel) {
                if (firstPatient.isTarget(target)) break;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}


class Patient {
    int id;
    int level;

    public Patient(int id, int level) {
        this.id = id;
        this.level = level;
    }

    public boolean isTarget(int target) {
        return this.id == target;
    }

    public boolean hasHigherLevelThan(Patient another) {
        return this.level > another.level;
    }
}