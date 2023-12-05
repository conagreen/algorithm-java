<div align="center">
<h1>🔥 행렬 테두리 회전하기 🔥 </h1>
</div>

<br>

### 1. 문제 링크

[행렬 테두리 회전하기](https://school.programmers.co.kr/learn/courses/30/lessons/77485)

### 2. 문제 풀이

#### 코드
```java
public class Solution {
    public static void main(String[] args) {
        int rows = 6, columns = 6;
        int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        System.out.println(Arrays.toString(solution(rows, columns, queries)));
    }

    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] matrix = makeMatrix(rows, columns);

        for (int i = 0; i < queries.length; i++) {
            answer[i] = turnClockwiseAndFindMinValue(matrix, queries[i]);
        }

        return answer;
    }

    private static int turnClockwiseAndFindMinValue(int[][] matrix, int[] query) {
        int min = Integer.MAX_VALUE;
        int minRow = query[0], maxRow = query[2];
        int minCol = query[1], maxCol = query[3];
        int temp = matrix[minRow][minCol];

        for (int i = minRow; i < maxRow; i++) {
            matrix[i][minCol] = matrix[i+1][minCol];
            min = Math.min(matrix[i][minCol], min);
        }

        for (int i = minCol; i < maxCol; i++) {
            matrix[maxRow][i] = matrix[maxRow][i+1];
            min = Math.min(matrix[maxRow][i], min);
        }

        for (int i = maxRow; i > minRow; i--) {
            matrix[i][maxCol] = matrix[i-1][maxCol];
            min = Math.min(matrix[i][maxCol], min);
        }

        for (int i = maxCol; i > minCol; i--) {
            matrix[minRow][i] = matrix[minRow][i-1];
            min = Math.min(matrix[minRow][i], min);
        }

        matrix[minRow][minCol + 1] = temp;
        min = Math.min(matrix[minRow][minCol + 1], min);

        return min;
    }

    private static int[][] makeMatrix(int rows, int columns) {
        int[][] matrix = new int[rows + 1][columns + 1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                matrix[i][j] = (i - 1) * columns + j;
            }
        }
        return matrix;
    }
}
```

**[ 시간 복잡도 - O(n)]**