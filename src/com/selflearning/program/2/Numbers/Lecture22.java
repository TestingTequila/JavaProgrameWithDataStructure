package com.selflearning.program.Numbers;

public class Lecture22 {
    public static void main(String[] args) {
        specialNumbers(28);
    }

    public static void specialNumbers(int number) {
        int initialNumber = number;
        int sum = 0;//11
        int product = 1;//18

        while (number != 0) {
            int digit = number % 10;//2
            sum = sum + digit;//2+9 = 11
            product = product * digit;//9*2 =18
            number = number/10;
        }

        if((sum+product)==initialNumber)
        {
            System.out.println("The given " + initialNumber + " is a special Number");
        }
        else
        {
            System.out.println("The given " + initialNumber + " is not a special Number");
        }
    }
}
