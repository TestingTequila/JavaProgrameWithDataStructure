package Day21_Matrix3;

import java.util.Scanner;

public class SymmetricalMatrix
{
    static int[][] numbers1;
    public static void main(String[] args) {
        System.out.println(createMatrix(2,2));
    }

    public static boolean createMatrix(int rows, int columns)
    {
        Scanner scanner = new Scanner(System.in);
        numbers1 = new int[rows][columns];
        System.out.println("Enter the Numbers.....");
        for(int i =0; i <rows; i++)
        {
            for (int j =0; j<columns; j++)
            {
                numbers1[i][j]= scanner.nextInt();
            }
        }

        System.out.println(" -------------------Matrix1--------------");
        for(int i =0; i <rows; i++)
        {
            for (int j =0; j<columns; j++)
            {
                System.out.print(numbers1[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("-------------Transposed Matrix-----------");
        boolean flag = true;
        for(int i =0; i <rows; i++)
        {
            for (int j =0; j<columns; j++)
            {
                System.out.print(numbers1[j][i] + " ");
                if(numbers1[i][j]!=numbers1[j][i])
                {
                    flag =false;
                }
            }
            System.out.println();
        }
        return flag;
    }

}
