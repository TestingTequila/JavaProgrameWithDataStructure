package com.selflearning.program.Patterns;

public class Lecture65
{
    public static void main(String[] args) {
        reversePascalsTriangle(5);
    }

    public static void reversePascalsTriangle(int vertical)
    {
        for(int i=1; i<=vertical; i++)
        {
            for(int j=vertical; j>0; j--)
            {
                if(j>i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for(int i=1; i<=vertical-1; i++)
        {
            for(int j=1; j<=vertical; j++)
            {
                if(j<=i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
