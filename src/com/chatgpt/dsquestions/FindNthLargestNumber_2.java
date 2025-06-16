package com.chatgpt.dsquestions;

import java.util.Arrays;

public class FindNthLargestNumber_2 {
    public static void main(String[] args) {
        System.out.println((findNthLargestNumber(new int[]{5, 14, 31, 12, 1}, 3)));
    }

    public static int findNthLargestNumber(int[] numbers, int nthHighestNumber) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp = numbers[i];
                if (numbers[i] > numbers[j]) {
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers[numbers.length - nthHighestNumber];
    }
}
