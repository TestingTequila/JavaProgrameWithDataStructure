package com.selflearning.arrays;

import java.util.Arrays;

public class ReverseElementsInAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseElementsInAnArray(new int[]{1, 2, 3, 4, 5, 6})));
    }

    public static int[] reverseElementsInAnArray(int[] numbers) {
        int j = numbers.length - 1;
         for(int i=0; i<j; i++) {
             int temp = numbers[i];
                 numbers[i] = numbers[j];
                 numbers[j] = temp;
             j--;
         }
         return numbers;
    }
}
