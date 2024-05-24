package com.algorithm_2024.section03_연결리스트.에디터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
* 백준 - 1406
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> result = new LinkedList<>(Arrays.asList(br.readLine().split("")));
        int n = Integer.parseInt(br.readLine());

        ListIterator<String> iter = result.listIterator();
        while (iter.hasNext()) {
            iter.next();
        }

        while (n-- > 0) {
            String input = br.readLine();
            switch (input) {
                case "L":
                    if (iter.hasPrevious()) iter.previous();
                    break;
                case "D":
                    if (iter.hasNext()) iter.next();
                    break;
                case "B":
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                default:
                    String[] tokens = input.split(" ");
                    iter.add(tokens[1]);
            }
        }

        System.out.println(String.join("", result));
    }
}
