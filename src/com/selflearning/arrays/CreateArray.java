package com.selflearning.arrays;

import java.util.Arrays;
import java.util.Random;

public class CreateArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(10)));
    }

    public static int[] createArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(10, 99);
        }
        return numbers;
    }
}
