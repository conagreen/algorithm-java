<div align="center">
<h1>🔥 두 큐 합 같게 만들기 🔥 </h1>
</div>

<br>

### **[ INDEX ]**
<details>
<summary>1. 문제 링크</summary>

[두 큐 합 같게 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/118667)
</details>
<details>
<summary>2. 문제 풀이</summary>

```java
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 7, 2};
        int[] nums2 = {4, 6, 5, 1};

        System.out.println(solution(nums1, nums2));
    }

    public static int solution(int[] nums1, int[] nums2) {
        Queue<Long> queue1 = new LinkedList<>();
        Queue<Long> queue2 = new LinkedList<>();
        long sum1 = 0;
        long sum2 = 0;

        for (int i = 0; i < nums1.length; i++) {
            queue1.add((long) nums1[i]);
            queue2.add((long) nums2[i]);
            sum1 += nums1[i];
            sum2 += nums2[i];
        }

        int count = 0;
        int limitLength = nums1.length * 3;
        long targetNumber = (sum1 + sum2) / 2;

        for (int i = 0; i < limitLength; i++) {
            if (sum1 < targetNumber) {
                long num = queue2.poll();
                sum1 = sum1 + num;
                sum2 = sum2 - num;
                queue1.add(num);
                count++;
            } else if (sum2 < targetNumber) {
                long num = queue1.poll();
                sum2 = sum2 + num;
                sum1 = sum1 - num;
                queue2.add(num);
                count++;
            } else {
                return count;
            }
        }
        return -1;
    }
}
```

**[ 시간 복잡도 - O(n) ]**

1. 매개변수로 전달받은 nums1, nums2 배열을 Queue 자료형으로 변환
2. 각 배열의 합계를 구한 후 sum1(nums1의 합), sum2(nums2의 합) 변수에 저장
3. 두 큐의 합이 같으려면 총합(sum1 + sum2)의 절반 값(targetNumber)이 각 배열의 합이 되어야 함
4. 반복문을 돌면서 targetNumber의 값과 sum1, sum2 값을 비교하면서 targetNumber와 값이 같아질 수 있도록 계산
5. targetNumber의 값과 같아졌다면 계산이 이루어질 때마다 1씩 증가하였던 count를 반환
6. 탈출 조건 설정
    1. 두 큐의 값이 동일할 수 없는 케이스 존재 -> -1 반환 
    2. 이때, 반복문이 종료될 수 있는 설정을 하지 않는다면 무한 반복으로 인해 타임아웃 발생
    3. 반복문이 종료되는 조건의 기준은 시간 복잡도를 기준으로 설정 (두 배열의 길이 합 x 3) 

</details>
<details>
<summary>3. 코드 결과</summary>

![](mijin-result.png)
</details>