package com.algorithm_2021_2022.section4.section4_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        // Arrays.sort() 이용해서 구현
//        System.out.println(m.solution1(str1, str2));

        // HashMap 이용해서 구현
        System.out.println(m.solution2(str1, str2));

    }

    // Arrays.sort() 이용해서 구현
//        public String solution1(String str1, String str2) {
//        String result;
//
//        char[] chars1 = str1.toCharArray();
//        char[] chars2 = str2.toCharArray();
//
//        Arrays.sort(chars1);
//        Arrays.sort(chars2);
//
//        result = Arrays.equals(chars1, chars2) ? "YES" : "NO";
//
//
//        return result;
//    }


    // HashMap 이용해서 구현
    public String solution2(String str1, String str2) {
        String result = "YES";
        Map<Character, Integer> map = new HashMap<>();

        for (char key : str1.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0)+1);
        }

        for (char key : str2.toCharArray()) {
            if (!map.containsKey(key) || map.get(key) == 0) return "NO";
            map.put(key, map.get(key)-1);
        }

        return result;
    }
}
