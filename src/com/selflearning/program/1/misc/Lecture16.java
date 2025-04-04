package com.selflearning.program.misc;

public class Lecture16 {
    public static void main(String[] args) {
        integerToBinary(16);
    }

    public static void integerToBinary(int number) {
        int[] binaryArray = new int[10];
        int i = 0;
        while (number != 0) {
            binaryArray[i] = number % 2;
            number = number / 2;
            i++;
        }
        for(int j=i-1; j>=0; j--)
        {
            System.out.println(binaryArray[j]);
        }
    }



}

