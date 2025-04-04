package com.selflearning.program.Numbers;

public class Lecture14 {
    public static void main(String[] args) {
        System.out.println("Is palindrome: "  + palindromeOrNot(58914985));
    }

    public static boolean palindromeOrNot(int number) {
        boolean isPalindrome = false;
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        if (reversedNumber == originalNumber) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
