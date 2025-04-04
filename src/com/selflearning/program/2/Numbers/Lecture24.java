package com.selflearning.program.Numbers;

public class Lecture24 {
    public static void main(String[] args) {
        perfectNumberCheck(28);
    }

    public static void perfectNumberCheck(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println("The given number: " + number + " is a Perfect Number....");
        }
        else
        {
            System.out.println("The given number: " + number + " is a NOT Perfect Number....");
        }
    }
}
