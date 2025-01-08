package Day20_Marix2;

import java.util.Scanner;

public class SwapRowWithColumn
{
    public static void main(String[] args) {
        rowColumnSwapInMatrix(3,3);
    }

    public static void rowColumnSwapInMatrix(int rows, int columns)
    {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[rows][columns];
        System.out.println("Enter the numbers for Matrix .....");
        for(int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                numbers[i][j]= scanner.nextInt();
            }
        }

        System.out.println("Matrix Before Transpose .....");
        for(int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix After Transpose .....");
        for(int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                System.out.print(numbers[j][i] + " ");
            }
            System.out.println();
        }
    }
}
