package com.selflearning.program.Patterns;

public class Lecture59
{
    public static void main(String[] args) {
        rightTriangle(10,10);
    }
    public static void  rightTriangle(int horizontal, int vertical)
    {
        for(int i=1; i<=horizontal; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
