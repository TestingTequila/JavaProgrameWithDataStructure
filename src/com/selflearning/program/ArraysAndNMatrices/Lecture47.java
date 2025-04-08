package com.selflearning.program.ArraysAndNMatrices;

import java.util.Arrays;

public class Lecture47 {
    public static void main(String[] args) {
        reverseElementsInAnArray(new int[]{1, 2, 3, 4, 5});
    }

    public static void reverseElementsInAnArray(int[] numbers) {
        int[] newNumbers = new int[numbers.length];
        int j = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            newNumbers[j] = numbers[i];
            j++;
        }
        System.out.println(Arrays.toString(newNumbers));
    }
}
