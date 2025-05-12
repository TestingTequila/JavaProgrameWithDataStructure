package com.selflearning.program.misc;

public class Lecture18 {
    public static void main(String[] args) {
        fibonacciSeries(1, 2, 9);
    }

    public static void fibonacciSeries(int firstNumber, int secondNumber, int number) {
        System.out.print(firstNumber + " " + secondNumber +" ");
        for (int i = 2; i < number; i++) {
            int k = firstNumber + secondNumber;//1
            System.out.print(k+" ");
            firstNumber = secondNumber;//1
            secondNumber = k;
        }
    }
}
