package com.selflearning.program.Numbers;

public class Lecture9 {
    public static void main(String[] args) {
        sumOfDigitsOfANumber(12345);
    }

    public static void sumOfDigitsOfANumber(int number) {

        int sum = 0;//5
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum of Numbers is: " + sum);
    }
}
