package com.algorithm_2024.section08_HashMap_TreeSet.모든_아나그램_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
 * 인프런 - 자바 알고리즘 4-4
 * */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String target = br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> targetMap = new HashMap<>();
        for (int i = 0; i < target.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            targetMap.put(target.charAt(i), targetMap.getOrDefault(target.charAt(i), 0) + 1);
        }

        int answer = 0, lt = 0;
        if (map.equals(targetMap)) answer++;

        for (int rt = target.length(); rt < str.length(); rt++) {
            if (map.get(str.charAt(lt)) == 1) map.remove(str.charAt(lt));
            else map.put(str.charAt(lt), map.get(str.charAt(lt)) - 1);
            map.put(str.charAt(rt), map.getOrDefault(str.charAt(rt), 0) + 1);
            if (map.equals(targetMap)) answer++;
            lt++;
        }

        System.out.println(answer);
    }
}
