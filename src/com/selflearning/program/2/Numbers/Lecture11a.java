package com.selflearning.program.Numbers;

public class Lecture11a {
    public static void main(String[] args) {
        countOfDigitsInANumber(0);
    }

    public static void countOfDigitsInANumber(long number) {
        int count = 0;
        while (number != 0) {
            long digit = number % 10;
            count++;
            number = number / 10;
        }
        System.out.println("Count Of Numbers: " + count);
    }
}
