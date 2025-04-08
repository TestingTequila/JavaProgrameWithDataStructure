package com.selflearning.program.ArraysAndNMatrices;

public class Lecture46 {
    public static void main(String[] args) {
        sumOfPositiveAndNegative(new int[]{1, -3, 5, 6, -7, -2, 8});
    }

    public static void sumOfPositiveAndNegative(int[] numbers) {
        int sunOfPositiveNumbers = 0;
        int sumOfNegativeNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {

                sunOfPositiveNumbers = sunOfPositiveNumbers + numbers[i];
            }
            else
            {
                sumOfNegativeNumbers = sumOfNegativeNumbers + numbers[i];
            }
        }
        System.out.println("sunOfPositiveNumbers: " + sunOfPositiveNumbers);
        System.out.println("sumOfNegativeNumbers: " + sumOfNegativeNumbers);
    }
}
