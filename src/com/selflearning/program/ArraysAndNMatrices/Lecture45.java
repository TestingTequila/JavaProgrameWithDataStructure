package com.selflearning.program.ArraysAndNMatrices;
public class Lecture45 {

    public static void main(String[] args) {
        System.out.println(sumOfAllEvenNumbersInAnArray(new int[]{10, 21, 30, 4, 5}));
    }

    public static int sumOfAllEvenNumbersInAnArray(int[] numbers) {
        int sumOfEvenNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumOfEvenNumbers = sumOfEvenNumbers + numbers[i];
            }
        }
        return sumOfEvenNumbers;
    }
}
