package com.selflearning.program.Recursion;

public class Lecture43 {
    public static void main(String[] args) {
        System.out.println(power(2,4));
    }

    public static int power(int base, int exponent) {

        if(exponent==1)
        {
            return base;
        }
        else
        {
            return  base*power(base, exponent-1);
        }

    }
}
