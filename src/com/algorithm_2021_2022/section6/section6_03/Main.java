package com.algorithm_2021_2022.section6.section6_03;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int[] nums = new int[num];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int x : m.solution(num, nums)) {
            System.out.print(x + " ");
        }


    }

    private int[] solution(int num, int[] nums) {
        for (int i = 1; i < num; i++) {
            int tmp = nums[i];
            int aux = i - 1;
            while (aux >= 0 && nums[aux] > tmp) {
                nums[aux+1] = nums[aux];
                aux--;
            }
            nums[aux+1] = tmp;
        }

        return nums;
    }
}
