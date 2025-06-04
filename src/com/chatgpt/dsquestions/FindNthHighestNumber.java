package com.chatgpt.dsquestions;

import java.util.Arrays;

public class FindNthHighestNumber {
    public static void main(String[] args) {
        findNthHighestNumber(new int[]{25, 10, 5, 30, 15}, 4);
    }
    public static void findNthHighestNumber(int[] numbers, int nthHighestNumber)
    {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp= numbers[i];
                if (numbers[i] > numbers[j]) {
                    numbers[i] = numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[numbers.length-nthHighestNumber]);
    }
}
