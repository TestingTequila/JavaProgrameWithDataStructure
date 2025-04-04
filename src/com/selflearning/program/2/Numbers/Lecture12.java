package com.selflearning.program.Numbers;

public class Lecture12 {
    public static void main(String[] args) {
        multiplesOfThree(123456789);
    }

    public static void multiplesOfThree(int number) {
        int sumOfDigitsDivisibleByThree = 0;

        while (number != 0) {
            int digit = number % 10;
            if ((digit % 3) == 0) {
                sumOfDigitsDivisibleByThree = sumOfDigitsDivisibleByThree + digit;
            }
            number = number / 10;
        }

        System.out.println("sumOfDigitsDivisibleByThree: " + sumOfDigitsDivisibleByThree);
    }
}
