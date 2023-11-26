package com.algorithm_2021_2022.section1.section1_04;

import java.util.*;

public class Main {

    // StringBuilder 이용하지 않고 구현 1
//    public void solution1(List<String> list) {
//        for (int i = 0; i < list.size(); i++) {
//            String str = list.get(i);
//
//            char[] charArray = str.toCharArray();
//            char[] reversedArray = new char[charArray.length];
//            for (int j=0; j<charArray.length; j++){
//                reversedArray[j] = charArray[charArray.length - 1 - j];
//            }
//
//            System.out.println(reversedArray);
//        }
//
//    }

    // StringBuilder 이용하지 않고 구현 2
//    private void solution2(List<String> list) {
//        List<String> resultList = new ArrayList<>();
//
//        for (String word : list) {
//            char[] x = word.toCharArray();
//            int left = 0, right = word.length()-1;
//
//            while (left < right) {
//                char temp = x[left];
//                x[left] = x[right];
//                x[right] = temp;
//
//                left++;
//                right--;
//            }
//
//            resultList.add(String.valueOf(x));
//        }
//
//        for (String result : resultList) {
//            System.out.println(result);
//        }
//    }

    // StringBuilder 이용해서 구현
    private void solution3(List<String> list) {
        for (int i=0; i<list.size(); i++){
            String reversed = new StringBuilder(list.get(i)).reverse().toString();

            System.out.println(reversed);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for(int i = 0; i < count; i++) {
            list.add(scanner.next());
        }

        // StringBuilder 이용하지 않고 구현 1
//        m.solution1(list);

        // StringBuilder 이용해서 구현 2
//        m.solution2(list);

        // StringBuilder 이용해서 구현
        m.solution3(list);

    }

}
