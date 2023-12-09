package com.algorithm_2023.다시_풀어보기.section_02.큰_수_출력하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* 입력한 n개 만큼의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력
* 단, 첫 번째 수는 무조건 출력
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int num : solution(nums)) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> solution(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        answer.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                answer.add(nums[i]);
            }
        }
        return answer;
    }
}
