package com.algorithm_2024.section10_DFS_BFS.이모티콘_할인행사;

import java.util.Arrays;

class Solution {
    int[] discountRates;
    int emoticonCnt;
    int[] emoticons;
    int[][] users;
    int[] answer;

    public static void main(String[] args) {
        int[][] users = new int[][]{{40, 10000}, {25, 10000}};
        int[] emoticons = new int[]{7000, 9000};
        Solution solution = new Solution();
        int[] answer = solution.solution(users, emoticons);
        System.out.println(Arrays.toString(answer));
    }

    public int[] solution(int[][] users, int[] emoticons) {
        this.users = users;
        this.emoticons = emoticons;
        emoticonCnt = emoticons.length;
        discountRates = new int[emoticonCnt];
        answer = new int[2];
        dfs(0);
        return answer;
    }

    private void dfs(int level) {
        if (level == emoticonCnt) {
            findMax(discountRates);
        } else {
            for (int i = 10; i <= 40; i += 10) {
                discountRates[level] = i;
                dfs(level + 1);
            }
        }
    }

    private void findMax(int[] discountRates) {
        int[] discountPrice = new int[emoticonCnt];

        for (int i = 0; i < emoticonCnt; i++) {
            discountPrice[i] = emoticons[i] - (emoticons[i] / 100 * discountRates[i]);
        }

        int membership = 0;
        int sales = 0;

        for (int[] user : users) {
            int totalPrice = 0;
            for (int j = 0; j < emoticonCnt; j++) {
                if (discountRates[j] >= user[0]) {
                    totalPrice += discountPrice[j];
                }
            }
            if (totalPrice >= user[1]) membership++;
            else sales += totalPrice;
        }

        if (membership > answer[0]) {
            answer[0] = membership;
            answer[1] = sales;
        } else if (membership == answer[0] && sales > answer[1]) {
            answer[0] = membership;
            answer[1] = sales;
        }
    }
}