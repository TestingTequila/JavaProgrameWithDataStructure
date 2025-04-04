package com.selflearning.program.Numbers;

public class Lecture21
{
    public static void main(String[] args) {
        nivenNumbers(13);
    }

    public static void nivenNumbers(int number)
    {
        int initialNumber = number;
        int total =0;

        while (number!=0)
        {
            int digit = number%10;
            total = total+digit;
            number= number/10;
        }

        if(initialNumber%total==0)
        {
            System.out.println("The given number " + initialNumber + " is a Niven Number....");
        }
        else
        {
            System.out.println("The given number " + initialNumber + " is not a Niven Number....");
        }
    }
}
