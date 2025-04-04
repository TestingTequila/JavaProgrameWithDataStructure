package com.selflearning.program.Numbers;

public class Lecture12a {
    public static void main(String[] args) {
        System.out.println("Is a DUCK Number: " + checkForDuckNumber(12345));
    }

    public static boolean checkForDuckNumber(int number) {
        boolean isDuck = false;
        while (number != 0) {
            int digit = number % 10;
            if (digit == 0) {
                isDuck = true;
                break;
            }
            number = number / 10;

        }
        return isDuck;
    }


}
