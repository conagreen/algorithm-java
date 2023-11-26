package com.algorithm_2021_2022.section5.section5_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String requiredSub = br.readLine();
        String subjects = br.readLine();

        // Queue 사용하지 않고 구현
//        System.out.println(main.solution1(requiredSub, subjects));

        // Queue 사용해서 구현
        System.out.println(main.solution2(requiredSub, subjects));

    }


    // Queue 사용하지 않고 구현
//    private String solution1(String requiredSub, String subjects) {
//        String result = "NO";
//        int[] nums = new int[requiredSub.length()];
//
//        for (int i = 0; i < requiredSub.length(); i++) {
//            nums[i] = subjects.indexOf(requiredSub.charAt(i));
//        }
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i-1] > nums[i]) return result;
//        }
//
//        result = "YES";
//
//        return result;
//    }


    // Queue 사용해서 구현
    private String solution2(String requiredSub, String subjects) {
        Queue<Character> queue = new LinkedList<>();
        String result = "NO";

        for (char x : requiredSub.toCharArray()) {
            queue.offer(x);
        }

        for (char sub : subjects.toCharArray()) {
            if (queue.contains(sub)) {
                if (queue.poll() != sub) return result;
            }
        }

        if (queue.isEmpty()) result = "YES";

        return result;
    }

}
