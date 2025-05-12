package com.selflearning.program.Patterns;

public class Lecture60
{
    public static void main(String[] args) {
        rightTriangleTwoVariation(10, 10);
    }

    public static void rightTriangleTwoVariation(int horizontal, int vertical)
    {
        for(int i=1; i<=horizontal; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
