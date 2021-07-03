package com.algorithm.section1.section1_12;

import com.sun.org.apache.bcel.internal.generic.FSUB;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // substring() 사용하지 않고 구현
//    public String solution1(int num, String str) {
//        String result = "";
//;
//        String[] StringArray = new String[num];
//        int[] intArray = new int[num];
//        char[] charArray = new char[num];
//
//        str = str.replaceAll("#", "1");
//        str = str.replaceAll("\\*", "0");
//
//        for (int i = 0; i < num; i++) {
//            StringArray[i] = "";
//
//            for (int j = 0; j < 7; j++) {
//                StringArray[i] += str.charAt(j + (i*7));
//            }
//
//            intArray[i] = Integer.parseInt(StringArray[i], 2);
//            charArray[i] = (char) intArray[i];
//
//            result += charArray[i];
//
//        }
//        return result;
//    }

    // substring() 사용해서 구현
    public String solution2(int count, String str) {
        String result = "";

        str = str.replace('#', '1').replace('*', '0');

        String[] stringArray = new String[count];

        for (int i = 0; i < count; i++) {
            stringArray[i] = str.substring(0, 7);
            str = str.substring(7);

            int num = Integer.parseInt(stringArray[i], 2);
            result += (char)num;

        }

        return result;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        String str = scanner.next();

        // substring() 사용하지 않고 구현
//        System.out.println(m.solution1(num, str));

        // substring() 사용해서 구현
        System.out.println(m.solution2(count, str));
    }
}
