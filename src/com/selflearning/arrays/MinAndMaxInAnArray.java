package com.selflearning.arrays;

public class MinAndMaxInAnArray {
    public static void main(String[] args) {
        minAndMaxInAnArray(new int[]{14, 2, 3, 4, 5, 0, 7});
    }

    public static void minAndMaxInAnArray(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum Number in an Array: " + max + " and Minimum number in an Array: " + min);
    }

}
