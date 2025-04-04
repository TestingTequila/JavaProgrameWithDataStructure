package com.selflearning.program.Numbers;

public class Lecture10 {
    public static void main(String[] args) {
        sumOfEvenAndOddNumber(123456);
    }

    public static void sumOfEvenAndOddNumber(int number) {
        int sumOfEvenNumber = 0;
        int sumOfOddNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sumOfEvenNumber = sumOfEvenNumber + digit;
            } else {
                sumOfOddNumber = sumOfOddNumber + digit;
            }

            number = number / 10;
        }
        System.out.println("sumOfEvenNumber: " + sumOfEvenNumber);
        System.out.println("sumOfOddNumber: " + sumOfOddNumber);
    }
}
