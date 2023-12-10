<div align="center">
<h1>🔥 양궁대회 🔥 </h1>
</div>

<br>

### 1. 문제 링크

[양궁대회](https://school.programmers.co.kr/learn/courses/30/lessons/92342)

### 2. 문제 풀이

#### 코드
```java
public class Solution {
    static int num;
    static int[] apeachInfo;
    static int[] ryanInfo = new int[11];
    static int[] answer = {-1};
    static int maxDiff = 0;

    public static void main(String[] args) {
        int n = 10;
        int[] info = {0, 0, 0, 0, 0, 0, 0, 0, 3, 4, 3};
        System.out.println(Arrays.toString(solution(n, info)));
    }

    public static int[] solution(int n, int[] info) {
        num = n;
        apeachInfo = info;
        dfs(0);
        return answer;
    }

    private static void dfs(int cnt) {
        if (cnt == num) {
            calculateAnswer();
            return;
        }

        for (int i = 0; i < ryanInfo.length && ryanInfo[i] <= apeachInfo[i]; i++) {
            ryanInfo[i]++;
            dfs(cnt + 1);
            ryanInfo[i]--;
        }
    }

    private static void calculateAnswer() {
        int apeachScore = 0, ryanScore = 0;
        for (int i = 0; i < ryanInfo.length; i++) {
            if (hasAnyScore(apeachInfo[i], ryanInfo[i])) {
                if (apeachInfo[i] >= ryanInfo[i]) apeachScore += (10 - i);
                else ryanScore += (10 - i);
            }
        }

        int diff = ryanScore - apeachScore;
        if (diff > 0 && diff >= maxDiff) {
            maxDiff = diff;
            answer = ryanInfo.clone();
        }
    }

    private static boolean hasAnyScore(int apeachScore, int ryanScore) {
        return apeachScore > 0 || ryanScore > 0;
    }
}
```