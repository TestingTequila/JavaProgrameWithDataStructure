package com.selflearning.program.ArraysAndNMatrices;

import java.util.Arrays;

public class Lecture44 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArrayFrom(5)));
    }

    public static int[] createArrayFrom(int arraySize) {
        int[] arrayName = new int[arraySize];
        for (int i = 0; i < arrayName.length; i++) {
            arrayName[i] = i * 10;
        }
        return arrayName;
    }
}
