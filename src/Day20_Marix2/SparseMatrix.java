package Day20_Marix2;

import java.util.Scanner;
import java.util.SortedMap;

public class SparseMatrix
{
    static  int count =0;
    public static void main(String[] args) {
        System.out.println(printMatrix(2,2));

    }

    public  static boolean printMatrix(int rows, int columns)
    {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[rows][columns];
        System.out.println("Two dimensional Array Length :"+numbers.length);
        boolean isSparse = false;
        System.out.println("Enter the number.........");
        for(int i=0; i<rows; i++)
        {
            for (int j=0; j<columns; j++)
            {
                numbers[i][j]= scanner.nextInt();
            }
        }

        System.out.println("==================Matrix Output========");

        for(int i=0; i<rows; i++)
        {
            int average = (rows * columns)/2;
            for (int j=0; j<columns; j++)
            {
                if(numbers[i][j]==0)
                {
                    count++;
                }

            }
            if(count>average)
            {
                isSparse= true;
            }

        }

        return isSparse;
    }
}
