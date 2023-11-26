package com.algorithm_2021_2022.section2.section2_12;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int times = scanner.nextInt();
        int[][] ranks = new int[times][num];

        for (int i = 0; i < times; i++) {
            for (int j = 0; j < num; j++) {
                ranks[i][j] = scanner.nextInt();
            }
        }

        // 3중 for문으로 구현
//        System.out.println(m.solution1(num, times, ranks));

        // 4중 for문으로 구현
        System.out.println(m.solution2(num, times, ranks));
    }

    // 3중 for문으로 구현
//    private int solution1(int num, int times, int[][] ranks) {
//        Set<Integer> check = new HashSet<>();
//        int target = 0;
//        int count = 0;
//
//        for (int i = 0; i < num; i++) {
//            target++;
//            check.clear();
//
//            Loop :
//            for (int j = 0; j < times; j++) {
//                for (int k = 0; k < num; k++) {
//                    if (check.size() != num-1) {
//                        if (ranks[j][k] == target) {
//                            break;
//                        } else {
//                            check.add(ranks[j][k]);
//                        }
//                    } else {
//                        break Loop;
//                    }
//                }
//            }
//            count += (num-1-check.size());
//        }
//
//        return count;
//    }


    // 4중 for문으로 구현
    private int solution2(int num, int times, int[][] ranks) {
        int positionI = 0, positionJ = 0;
        int count = 0;
        int result = 0;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                count = 0;
                for (int k = 0; k < times; k++) {
                    for (int s = 0; s < num; s++) {
                        if (i == ranks[k][s]) positionI = s;
                        if (j == ranks[k][s]) positionJ = s;
                    }
                    if (positionI < positionJ) count++;
                    if (positionI > positionJ) break;
                }
                if (count == times) result++;
            }
        }

        return result;
    }

}
