package com.chatgpt.dsquestions;

import java.util.Arrays;

public class ReverseAnArray_I {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseAnArray(new int[]{12, 13, 14, 15, 16, 17})));
    }

    public static int[] reverseAnArray(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        return numbers;
    }
}
