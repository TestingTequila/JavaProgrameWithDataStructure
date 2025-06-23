package com.selflearning.arrays;

public class PrintOddIndexElements_ {
    public static void main(String[] args) {
        printOddIndexElements(new int[]{15, 12, 31, 49, 54, 61, 70, 88, 96, 10});
    }

    public static void printOddIndexElements(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
