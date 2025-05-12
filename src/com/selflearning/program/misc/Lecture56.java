package com.selflearning.program.misc;

import com.sun.source.tree.BreakTree;

import java.util.Random;

public class Lecture56
{
    public static void main(String[] args) {
        int[][] storedMatrix=createMatrix(3,3);

        System.out.println("==================================");

        for (int i=0; i<storedMatrix.length; i++)
        {
            for(int j=0; j<storedMatrix[0].length; j++)
            {
                System.out.print(storedMatrix[j][i]+ " ");
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix(int rows, int columns)
    {
        int[][] matrix = new int[rows][columns];
        Random random = new Random();
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                matrix[i][j]= random.nextInt(9);
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
        return matrix;
    }

}
