package com.selflearning.program.Numbers;

public class Lecture13 {
    public static void main(String[] args) {
        reverseAnIntegerNumber(12345);
    }

    public static void reverseAnIntegerNumber(int number) {
        int newNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            newNumber = newNumber * 10 + digit;
            number = number / 10;
        }
         System.out.println(newNumber);
    }
}
