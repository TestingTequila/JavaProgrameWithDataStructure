package com.selflearning.program.Patterns;

public class Lecture63
{
    public static void main(String[] args) {
        invertedRightAngledTriangle(10);
    }

    public static void invertedRightAngledTriangle(int n)
    {

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(j<i)
                {
                    System.out.print(" ");
                }
                else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
}
