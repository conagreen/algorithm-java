package com.algorithm.level_01.분수_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String result = main.solution(n);
        System.out.println(result);
    }

    private String solution(int n) {
        int x = 0;
        int top, bottom;
        int count = 0;
        if (n == 1) return "1/1";
        else  {
            while (count < n) {
                x++;
                count = x * (x+1)/2;
            }
            int num = n - (x-1) * x/2;
            if (x % 2 == 0) {
                top = num;
                bottom = x - num + 1;
            } else {
                top = x - num + 1;
                bottom = num;
            }
            return top + "/" + bottom;
        }
    }
}
