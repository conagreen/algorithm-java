package com.algorithm_2023.다시_풀어보기.section_02.뒤집은_소수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int answer : solution(cnt, nums)) {
            System.out.print(answer + " ");
        }
    }

    private static List<Integer> solution(int cnt, int[] nums) {
        int[] reversedNums = new int[cnt];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < cnt; i++) {
            reversedNums[i] = reverse(nums[i]);
            if (max < reversedNums[i]) {
                max = reversedNums[i];
            }
        }

        List<Integer> primeNumbers = getPrimeNumbers(max);
        List<Integer> answer = new ArrayList<>();
        for (int num : reversedNums) {
            if (primeNumbers.contains(num)) {
                answer.add(num);
            }
        }
        return answer;
    }

    private static List<Integer> getPrimeNumbers(int num) {
        List<Integer> primeNumbers = new ArrayList<>();
        int[] candidates = new int[num + 1];
        primeNumbers.add(2);
        int limit = (int) Math.sqrt(num);

        for (int i = 2; i <= limit; i++) {
            for (int j = i * 2; j <= num; j += i) {
                if (j % i == 0) {
                    candidates[j] = 1;
                }
            }
        }

        for (int i = 2; i <= num; i++) {
            if (candidates[i] == 0) primeNumbers.add(i);
        }

        return primeNumbers;
    }

    private static int reverse(Integer num) {
        int reversedNum = 0;
        while (num != 0) {
            reversedNum = (num % 10) + (reversedNum * 10);
            num /= 10;
        }
        return reversedNum;
    }
}
