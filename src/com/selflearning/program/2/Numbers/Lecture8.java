package com.selflearning.program.Numbers;

public class Lecture8 {
    public static void main(String[] args) {
        printDigitsInANumber(12345);
    }

    public static void printDigitsInANumber(int number) {
            while (number != 0) {
                int digit = number % 10;
                System.out.println(digit);
                number = number / 10;
            }
    }
}
