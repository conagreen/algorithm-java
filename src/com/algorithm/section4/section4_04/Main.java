package com.algorithm.section4.section4_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String target = br.readLine();

        System.out.println(m.solution(str, target));
    }

    private int solution(String str, String target) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> targetMap = new HashMap<>();
        char[] chars = str.toCharArray();
        int result = 0;
        int lt = 0;

        for (char key : target.toCharArray()) {
            targetMap.put(key, targetMap.getOrDefault(key, 0)+1);
        }

        for (int i = 0, len = target.length()-1; i < len; i++ ) {
            map.put(chars[i], map.getOrDefault(chars[i], 0)+1);
        }

        for (int rt = target.length()-1, strLen = str.length(); rt < strLen; rt++) {
            map.put(chars[rt], map.getOrDefault(chars[rt], 0)+1);

            if (map.equals(targetMap)) result++;

            map.put(chars[lt], map.get(chars[lt])-1);
            if (map.get(chars[lt]) == 0) {
                map.remove(chars[lt]);
            }
            lt++;
        }

        return result;
    }
}
