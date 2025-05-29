package com.selflearning.program.misc;

public class Lecture66
{
    public static void main(String[] args) {
        sandGlass(5);
    }

    public static void sandGlass(int vertical)
    {
         for(int i=0; i<vertical; i++)
         {
             for(int k=0; k<i ; k++)
             {
                 System.out.print(" ");
             }
             for(int j=1; j<=vertical-i; j++)
             {
                 System.out.print(" * ");
             }
             System.out.println();
         }

         for(int i=1; i<=vertical; i++)
         {
             for(int k=0; k<vertical-i ; k++)
             {
                 System.out.print(" ");
             }
             for(int j=1; j<=i; j++)
             {
                 System.out.print(" * ");
             }
             System.out.println();
         }

    }
}
