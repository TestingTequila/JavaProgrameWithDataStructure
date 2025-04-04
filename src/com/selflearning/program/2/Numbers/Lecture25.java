package com.selflearning.program.Numbers;

public class Lecture25
{
    public static void main(String[] args) {
        System.out.println("Is an ArmStrong Number: "+armstrongNumberCheck(369));
    }
    public static boolean armstrongNumberCheck(int number)
    {
        int initialNumber = number;
        int sum = 0;
        boolean check = false;
        while (number!=0)
        {
            int digit = number%10;
            sum = sum+ digit*digit*digit;
            number =number/10;
        }
        if(sum==initialNumber)
        {
            check = true;

        }
        return check;
    }
}
