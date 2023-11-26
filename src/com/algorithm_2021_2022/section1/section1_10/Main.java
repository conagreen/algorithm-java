package com.algorithm_2021_2022.section1.section1_10;

import java.util.Scanner;

public class Main {

    // 버전 1
//    public void solution1(String str, char c) {
//        int first = str.indexOf(c, 0);
//        int second = str.indexOf(c, 0);
//        int result;
//
//        if (str.contains(String.valueOf(c))){
//            for (int i = 0; i < str.length(); i++){
//
//                if (i == first) {
//                    result = 0;
//                } else if (i == second) {
//                    result = 0;
//                    first = second;
//                } else if (first == second) {
//                    if (second >= i) result = second - i;
//                    else result = i - second;
//                } else {
//                    result = Math.min((second - i), (i - first));
//                }
//
//                if (str.indexOf(c, i+1) != -1) {
//                    second = str.indexOf(c, i+1);
//                }
//
//                System.out.print(result + " ");
//            }
//
//        }
//    }

    // 버전 2
    public void solution2(String str, char c) {
        char[] charArray = str.toCharArray();
        int[] resultArray = new int[str.length()];
        int count = 1000;

        if (str.contains(String.valueOf(c))) {
            for (int i = 0; i < str.length(); i++) {
                if (charArray[i] == c) {
                    count = 0;
                    resultArray[i] = count;
                } else {
                    count++;
                    resultArray[i] = count;
                }
            }

            count = 1000;

            for (int i = str.length()-1; i >= 0; i--) {
                if (charArray[i] == c) {
                    count = 0;
                } else {
                    count++;
                    resultArray[i] = Math.min(resultArray[i], count);
                }
            }

            for (int result : resultArray) {
                System.out.print(result + " ");
            }

        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System. in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);

        // 버전 1
//        m.solution1(str, c);

        // 버전 2
        m.solution2(str, c);

    }
}
