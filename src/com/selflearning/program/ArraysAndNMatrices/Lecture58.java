package com.selflearning.program.ArraysAndNMatrices;

import java.util.Random;

public class Lecture58
{
    public static void main(String[] args) {
        swapColumns(createMatrix(3,3), 2,3);
    }

    public static int[][] createMatrix(int rows, int columns)
    {
        Random random =new Random();
        int[][] matrix = new int[rows][columns];
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                matrix[i][j]=random.nextInt(9);
            }
        }
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("******************************************");
        return matrix;
    }

    public static void  swapColumns(int[][] matrix, int col1, int col2)//1,3
    {
        int number;
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                number=matrix[i][col1-1];
                matrix[i][col1-1]=matrix[i][col2-1];
                matrix[i][col2-1]=number;
            }
        }
        for(int k=0; k<matrix.length; k++)
        {
            for(int l=0; l<matrix[0].length; l++)
            {
                System.out.print(matrix[k][l]+ " ");
            }
            System.out.println();
        }
    }


}
