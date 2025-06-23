package com.selflearning.arrays;

import java.util.Arrays;

public class PrintLastMElementsOfAnArray {
    public static void main(String[] args) {
        Arrays.toString(lastMElementsOfAnArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 4));
    }

    public static int[] lastMElementsOfAnArray(int[] numbers, int lastNValues) {
        for (int i = numbers.length - 1; i >= numbers.length - lastNValues; i--) {
            System.out.println(numbers[i]);
        }
        return numbers;
    }
}
