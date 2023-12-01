<div align="center">
<h1>🔥 주차 요금 계산 🔥 </h1>
</div>

<br>

### 1. 문제 링크

[주차 요금 계산](https://school.programmers.co.kr/learn/courses/30/lessons/92341)

### 2. 문제 풀이

```java
public class Solution {
    static Map<Integer, Integer> carAndParkingTimes = new HashMap<>();
    static Map<Integer, Integer> histories = new HashMap<>();
    static Map<Integer, Integer> result = new HashMap<>();
    static final int MAX_TIME_BY_MINUTE = 1439;
    static int basicTime, basicCharge;
    static int addTime, addCharge;

    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT",
                "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        System.out.println(solution(fees, records));
    }

    public static List<Integer> solution(int[] fees, String[] records) {
        basicTime = fees[0]; basicCharge = fees[1];
        addTime = fees[2];addCharge = fees[3];

        for (String record : records) {
            String[] tokens = record.split(" ");
            String[] hourAndMinute = tokens[0].split(":");
            int carNumber = Integer.parseInt(tokens[1]);
            String action = tokens[2];
            int hour = Integer.parseInt(hourAndMinute[0]), minute = Integer.parseInt(hourAndMinute[1]);
            int time = convertToMinute(hour) + minute;
            calculateParkingTime(action, carNumber, time);
        }
        calculateParkingTimeOfParkedCars();
        calculateParkingFee(carAndParkingTimes);
        return sortInAscendingOrder();
    }

    private static List<Integer> sortInAscendingOrder() {
        Object[] resultKeys = result.keySet().toArray();
        Arrays.sort(resultKeys);
        List<Integer> resultList = new ArrayList<>();

        for (Object resultKey : resultKeys) {
            resultList.add(result.get(resultKey));
        }

        return resultList;
    }

    private static void calculateParkingFee(Map<Integer, Integer> carAndParkingTimes) {
        for (Map.Entry<Integer, Integer> carAndParkingMin : carAndParkingTimes.entrySet()) {
            if (carAndParkingMin.getValue() <= basicTime) {
                result.put(carAndParkingMin.getKey(), basicCharge);
            } else {
                result.put(carAndParkingMin.getKey(), (int) Math.ceil((carAndParkingMin.getValue() - basicTime) / (double) addTime) * addCharge + basicCharge);
            }
        }
    }

    private static void calculateParkingTimeOfParkedCars() {
        for (Map.Entry<Integer, Integer> history : histories.entrySet()) {
            carAndParkingTimes.put(history.getKey(), carAndParkingTimes.getOrDefault(history.getKey(), 0) + (MAX_TIME_BY_MINUTE - history.getValue()));
        }
    }

    private static void calculateParkingTime(String action, int carNumber, int time) {
        switch (action) {
            case "IN":
                histories.put(carNumber, time);
                break;
            case "OUT":
                int usingMin = time - histories.get(carNumber);
                histories.put(carNumber, MAX_TIME_BY_MINUTE);
                carAndParkingTimes.put(carNumber, carAndParkingTimes.getOrDefault(carNumber, 0) + usingMin);
                break;
        }
    }

    private static int convertToMinute(int hour) {
        return hour * 60;
    }
}
```

**[ 시간 복잡도 - O(n) ]**
