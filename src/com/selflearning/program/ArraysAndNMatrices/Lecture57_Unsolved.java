package com.selflearning.program.ArraysAndNMatrices;

import java.util.Random;

public class Lecture57_Unsolved
{
    public static void main(String[] args) {
        int[][] storedMatrix1=createMatrix(3,3);
        System.out.println("************************************");
        int[][] storedMatrix2=transposeMatrix(storedMatrix1);
        boolean flag = true;
        for(int i=0; i<storedMatrix2.length; i++)
        {
            for (int j=0; j<storedMatrix2[0].length;j++)
            {
                int m1Number=storedMatrix1[i][j];
                int m2Number=storedMatrix2[i][j];
                if(m1Number!=m2Number)
                {
                    flag = false;
                    break;
                }
            }

            System.out.println("FLAG= " + flag);
        }
    }

    public static int[][] createMatrix(int rows, int columns)
    {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<columns; j++)
            {
                matrix[i][j]= random.nextInt(9);
            }
        }
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<matrix.length; j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static int[][] transposeMatrix(int[][] storedMatrix)
    {
        int[][] transposedMatrix= new int[storedMatrix.length][storedMatrix[0].length];
        for(int i=0; i<storedMatrix.length; i++)
        {
            for(int j=0; j<storedMatrix[0].length; j++)
            {
                transposedMatrix[i][j]=storedMatrix[i][j];
            }
            System.out.println();
        }
        for(int i=0; i<storedMatrix.length; i++)
        {
            for(int j=0; j<storedMatrix[0].length; j++)
            {
                System.out.print(transposedMatrix[j][i]+ " ");
            }
            System.out.println();
        }
        return transposedMatrix;
    }
}
