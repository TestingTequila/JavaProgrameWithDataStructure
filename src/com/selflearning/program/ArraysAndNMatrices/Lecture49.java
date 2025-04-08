package com.selflearning.program.ArraysAndNMatrices;

public class Lecture49 {
    public static void main(String[] args) {
        System.out.println("==============MIN/MAX Together========================");
        System.out.println(minAndMaxInAnArray(new int[]{121, 43, 65, 78, 1, -9, 4}));
        System.out.println("==============JUST MAX ========================");
        System.out.println(maxInAnArray(new int[]{121, 43, 65, 78, 1, -9, 4}));
        System.out.println("==============JUST MIN ========================");
        System.out.println(minInAnArray(new int[]{121, 43, 65, 78, 1, -9, 4}));

    }

    public static String maxInAnArray(int[] numbers) {
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        return "Max Number: " + maxNumber;
    }

    public static String minInAnArray(int[] numbers) {
        int minNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        return "Min Number: " + minNumber;
    }

    public static String minAndMaxInAnArray(int[] numbers) {
        int maxNumber = numbers[0];
        int minNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            } else if
            (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        return "Max Number: " + maxNumber + " & Min Number: " + minNumber;
    }
}
