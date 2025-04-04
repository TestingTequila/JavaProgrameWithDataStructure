package com.selflearning.program.Numbers;

public class Lecture11 {
    public static void main(String[] args) {
        sumOfPrimeDigits(1234567);
    }

    public static void sumOfPrimeDigits(int number) {
        int sumOfPrimeDigits = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                sumOfPrimeDigits = sumOfPrimeDigits + digit;
            }
            number = number / 10;
        }

        System.out.println("sumOfPrimeDigits: " + sumOfPrimeDigits);
    }
}
