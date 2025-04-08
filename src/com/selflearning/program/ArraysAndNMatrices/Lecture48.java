package com.selflearning.program.ArraysAndNMatrices;

public class Lecture48 {
    public static void main(String[] args) {
        miniPeaks(new int[]{1, 8, 7, 9, 8, 10, 6});
    }

    public static void miniPeaks(int[] numbers) {
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
                System.out.println(numbers[i]);
            }
        }
    }

}


