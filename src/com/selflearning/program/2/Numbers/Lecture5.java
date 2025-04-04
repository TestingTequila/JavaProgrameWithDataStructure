package com.selflearning.program.Numbers;

public class Lecture5 {
    public static void main(String[] args) {
        evenOrOdd(-9);
    }

    public static void evenOrOdd(int number) {
        if(number>=0) {
            if (number % 2 == 0) {
                System.out.println(number + " is an even number");
            } else {
                System.out.println(number + " is an odd number");
            }
        }
        else
        {
            System.out.println(number + " is a negative number");
        }
    }
}
