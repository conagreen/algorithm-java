package com.algorithm.section4.section4_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] nums = new int[num];

        for (int i = 0; i < num; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(num, target, nums));
    }

    private int solution(int num, int target, int[] nums) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        int count = 0;

        for (int i = 0; i < num; i++) {
            for (int j = i+1; j < num; j++) {
                for (int k = j+1; k < num; k++) {
                    set.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        if (set.size() >= target) {
            for (int x : set) {
                count++;
                if (count == target) return x;
            }
        }

        return -1;
    }


}
