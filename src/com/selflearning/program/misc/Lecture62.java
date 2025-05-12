package com.selflearning.program.misc;

public class Lecture62
{
    public static void main(String[] args) {
        mirroredRightTriangle(10);
    }

    public static void mirroredRightTriangle(int vertical)
    {
        for(int i=1; i<=vertical; i++)
        {
            for(int j=1; j<=vertical; j++)
            {
                System.out.print(" ");
                if(j<=vertical-i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
