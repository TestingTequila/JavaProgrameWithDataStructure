package com.selflearning.program.ArraysAndNMatrices;

import java.util.Random;

public class Lecture51
{
    public static void main(String[] args) {
        createAndPrintMatrix(3,3);
    }

    public static void createAndPrintMatrix(int rows, int columns)
    {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                matrix[i][j]=random.nextInt(10,20);

            }
        }

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
