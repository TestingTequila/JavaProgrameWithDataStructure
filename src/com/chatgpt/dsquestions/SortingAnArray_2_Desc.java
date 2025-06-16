package com.chatgpt.dsquestions;

import java.util.Arrays;

public class SortingAnArray_2_Desc {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortingAnArrayDesc(new int[]{6, 5, 3, 7, 1})));
    }

    public static int[] sortingAnArrayDesc(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp = numbers[i];
                if (numbers[i] < numbers[j]) {
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}
