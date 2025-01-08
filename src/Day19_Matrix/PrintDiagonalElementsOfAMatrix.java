package Day19_Matrix;

import java.util.Scanner;

public class PrintDiagonalElementsOfAMatrix
{
    public static void main(String[] args) {
        printDiagonalElements(3,3);
    }

    public static void printDiagonalElements(int rows, int columns)
    {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[rows][columns];
        System.out.println("Enter the Numbers of Matrix....");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<rows; j++)
            {
                {
                    numbers[i][j]=scanner.nextInt();
                }

            }
        }

        System.out.println("Diagonal Elements....");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<rows; j++)
            {
                if(i==j) {
                    System.out.println(numbers[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
