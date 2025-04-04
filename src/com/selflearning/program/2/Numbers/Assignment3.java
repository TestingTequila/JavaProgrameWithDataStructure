package com.selflearning.program.Numbers;

public class Assignment3 {
    public static void main(String[] args) {
        countOfADigitInAGivenNumber(123422, 2);
    }

    public static void countOfADigitInAGivenNumber(int number, int digitToCount) {
        int originalNumber = number;
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit == digitToCount) {
                count++;
            }
            number = number / 10;
        }

        System.out.println("Count of " + digitToCount + " in a given " + originalNumber + " is: " + count);
    }
}
