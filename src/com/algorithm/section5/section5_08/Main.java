package com.algorithm.section5.section5_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int[] patients = new int[num];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            patients[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(main.solution1(num, target, patients));

    }

    // class 이용해서 구현
    private int solution1(int num, int target, int[] patients) {
        int result = 0;
        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < num; i++) {
            queue.offer(new Person(i, patients[i]));
        }

        while (!queue.isEmpty()) {
            Person currPerson = queue.poll();
            for (Person person : queue) {
                if (person.priority > currPerson.priority) {
                    queue.offer(currPerson);
                    currPerson = null;
                    break;
                }
            }
            if (currPerson != null) {
                result++;
                if (currPerson.id == target) return result;
            }
        }

        return result;
    }

    public class Person {
        int id;
        int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

}
