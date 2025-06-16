package com.chatgpt.dsquestions;

import java.util.Arrays;

public class MoveAllZerosAtTheEnd_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveAllZerosAtTheEnd(new int[]{1, 5, 0, 6, 0, 2, 0, 3, 9})));
    }

    public static int[] moveAllZerosAtTheEnd(int[] numbers) {
        int i = 0;
        for (int num : numbers) {

            if (num != 0) {
                numbers[i] = num;
                i++;
            }
        }

        for (int j = i; j < numbers.length; j++) {
            numbers[j] = 0;
        }

        return numbers;
    }
}
