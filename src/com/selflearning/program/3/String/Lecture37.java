package com.selflearning.program.String;

import java.util.Arrays;

public class Lecture37 {
    public static void main(String[] args) {
        System.out.println(checkOrder("abfcde"));
    }

    public static String checkOrder(String word) {
        int[] numbers = new int[word.length()];

        for (int i = 0; i < word.length(); i++) {
            int number = word.charAt(i);
            numbers[i] = number;
        }

        System.out.println(Arrays.toString(numbers));
        int firstNumber = 0;
        int secondNumber = 1;

        String statement = "String is sorted";
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[firstNumber] < numbers[secondNumber]) {
                firstNumber++;
                secondNumber++;
                if (secondNumber >= numbers.length) {
                    break;
                }
            } else {
                statement = "Is Not a sorted String....";
                break;
            }
        }
        return statement;

    }
}
