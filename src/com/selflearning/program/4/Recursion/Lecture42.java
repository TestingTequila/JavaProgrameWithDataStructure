package com.selflearning.program.Recursion;

public class Lecture42 {
    public static void main(String[] args) {
        System.out.println(sumOfNumberTillN(3));
    }
    public static int sumOfNumberTillN(int number) {
        if (number > 0) {
            return (number + sumOfNumberTillN(number - 1));
        }
        return number;
    }
}
