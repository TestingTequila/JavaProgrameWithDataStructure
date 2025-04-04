package com.selflearning.program.Numbers;

public class Lecture23 {
    public static void main(String[] args) {
        primeNumbersInGivenRange(2, 12);
    }

    public static void primeNumbersInGivenRange(int initialNumber, int finalNumber) {
        int count = 0;
        for (int i = initialNumber; i <= finalNumber; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i % j) == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println(i + " : Is a prime number");
            }
            count = 0;

        }
    }
}
