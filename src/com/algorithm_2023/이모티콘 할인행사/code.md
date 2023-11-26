<div align="center">
<h1>🔥 이모티콘 할인행사 🔥 </h1>
</div>

<br>

### **[ INDEX ]**
<details>
<summary>1. 문제 링크</summary>

[이모티콘 할인행사](https://school.programmers.co.kr/learn/courses/30/lessons/150368)
</details>
<details>
<summary>2. 문제 풀이</summary>

```java
public class Solution {
    static int maxSubscriptionCount = 0;
    static int maxSalesAmount = 0;
    static int[][] users;
    static int[] emoticons;

    public static void main(String[] args) {
        int[][] users = {{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}};
        int[] emoticons = {1300, 1500, 1600, 4900};
        System.out.println(Arrays.toString(solution(users, emoticons)));
    }

    public static int[] solution(int[][] users, int[] emoticons) {
        Solution.users = users;
        Solution.emoticons = emoticons;
        recursive(new int[emoticons.length], 0);
        return new int[]{maxSubscriptionCount, maxSalesAmount};
    }

    private static void recursive(int[] cases, int cnt) {
        if (cnt == emoticons.length) {
            determineMaximumCountAndAmount(cases);
            return;
        }

        for (int i = 10; i <= 40; i += 10) {
            cases[cnt] = i;
            recursive(cases, cnt + 1);
        }
    }

    private static void determineMaximumCountAndAmount(int[] cases) {
        int totalSubscriptionCount = 0;
        int totalAmount = 0;
        for (int[] user : users) {
            int purchaseBaseRate = user[0];
            int subscriptionBaseAmount = user[1];
            int amount = 0;
            for (int j = 0; j < cases.length; j++) {
                int discountRate = cases[j];
                if (discountRate >= purchaseBaseRate) {
                    amount += calculateDiscountPrice(emoticons[j], discountRate);
                }
            }

            if (amount >= subscriptionBaseAmount) {
                totalSubscriptionCount++;
            } else {
                totalAmount += amount;
            }
        }

        if (totalSubscriptionCount > maxSubscriptionCount) {
            maxSubscriptionCount = totalSubscriptionCount;
            maxSalesAmount = totalAmount;
        } else if (totalSubscriptionCount == maxSubscriptionCount && totalAmount > maxSalesAmount) {
            maxSalesAmount = totalAmount;
        }
    }

    private static int calculateDiscountPrice(int price, int discountRate) {
        return price - (price / 100 * discountRate);
    }
}
```

**[ 시간 복잡도 - O(4^n) ]**
- 해당 문제는 각 이모티콘의 할인율 조합으로 최대의 결과를 만들 수 있는 계산식을 구현하는 것이 핵심이다.
- 가장 많은 이모티콘 플러스 서비스 가입자 수와 이모티콘 판매액을 리턴하기 위해서는 이모티콘 할인율 조합으로 올 수 있는 모든 경우의 수를 알아내야 한다.  
- 모든 경우의 수를 알아내기 위해서 재귀 함수를 구현하였다. (완전 탐색 - DFS)
- 재귀 함수를 통해 경우의 수가 완성될 때마다 해당 경우의 수를 인자로 넘겨 가입자 수와 매출액을 계산한다.
- 즉, 재귀의 탈출 조건은 하나의 경우의 수가 완성되는 시점이다.
- 파라미터로 넘어온 경우의 수로 계산된 가입자 수와 매출액을 최대 가입자 수와 최대 매출액과 비교하여 값을 치환해 준다.

</details>
<details>
<summary>3. 코드 결과</summary>

![](mijin-result.png)
</details>