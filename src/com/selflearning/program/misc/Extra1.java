package com.selflearning.program.misc;

public class Extra1
{
    public static void main(String[] args) {
        int x =5;
        int y =10;

//        x= x++ + ++y;
//        System.out.println("X: " + x); //16
//        System.out.println("Y: " + y); //11


        x= ++y + x++;

        System.out.println("X: " + x);//16
        System.out.println("Y: " + y);//11
    }
}
