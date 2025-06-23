package com.selflearning.arrays;

public class PrintSumOfPositiveAndNegativeNumbers {
    public static void main(String[] args) {
        System.out.println(printSumOfPositiveAndNegativeNumbers(new int[]{-12,23,45,-3,5,7}));
    }

    public static String printSumOfPositiveAndNegativeNumbers(int[] numbers) {
        int sumOfPositiveNumbers = 0;
        int sumOfNegativeNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                sumOfPositiveNumbers = sumOfPositiveNumbers + numbers[i];
            } else {
                sumOfNegativeNumbers = sumOfNegativeNumbers + numbers[i];
            }
        }
        return "sumOfPositiveNumbers: " + sumOfPositiveNumbers + " and sumOfNegativeNumbers: " + sumOfNegativeNumbers;
    }
}
