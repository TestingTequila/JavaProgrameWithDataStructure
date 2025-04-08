package com.selflearning.program.ArraysAndNMatrices;

import java.util.Arrays;

public class Lecture01 {
    public static void main(String[] args) {
        replaceFiveWithZero(new int[]{5, 3, 5, 6, 3, 5});
    }

    public static void replaceFiveWithZero(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 5 && numbers[i - 1] == 3) {
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
