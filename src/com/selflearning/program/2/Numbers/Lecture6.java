package com.selflearning.program.Numbers;

public class Lecture6
{
    public static void main(String[] args) {
        leapYearChecker(2024);
    }

    public static void leapYearChecker(int year)
    {
        if(year<0)
        {
            System.out.println(year +" is an invalid year...");
        }
        else
        {
            if((year%4==0 && year%100!=0)||(year%400==0))
            {
                System.out.println(year+ " is a Leap year...");
            }
            else
            {
                System.out.println(year + " is not a leap year...");
            }
        }
    }
}
