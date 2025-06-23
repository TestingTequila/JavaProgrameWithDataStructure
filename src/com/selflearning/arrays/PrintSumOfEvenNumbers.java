package com.selflearning.arrays;

public class PrintSumOfEvenNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfEvenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    public static int sumOfEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum = sum + num;
            }
        }
        return sum;
    }
}
