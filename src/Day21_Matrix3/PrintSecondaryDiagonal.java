package Day21_Matrix3;

import java.util.Scanner;

public class PrintSecondaryDiagonal
{
    public static void main(String[] args) {
        printingSecondaryDiagonal(4,4);
    }

    public  static void printingSecondaryDiagonal(int rows, int columns)
    {
        int[][] numbers = new int[rows][columns];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Numbers.....");
        for(int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                numbers[i][j]= scanner.nextInt();
            }
        }

        System.out.println("Matrix is.....");
        for(int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Secondary Diagonal Elements are......");
         int i=0;
        {
            for (int j=rows-1; j<columns; j--)
            {
                   if(j>=0)
                   {
                       System.out.println(numbers[i][j] + " ");
                       i++;
                   }
            }
        }
    }
}
