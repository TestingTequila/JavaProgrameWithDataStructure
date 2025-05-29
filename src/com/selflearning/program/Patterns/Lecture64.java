package com.selflearning.program.Patterns;

public class Lecture64
{
    public static void main(String[] args) {
        pascalsTriangleTop(5);
    }

    public static void pascalsTriangleTop(int maxVertical)
    {
        for(int i=1; i<=maxVertical; i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i=1; i<=maxVertical; i++)
        {
            for(int j=maxVertical-1; j>=i;j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
