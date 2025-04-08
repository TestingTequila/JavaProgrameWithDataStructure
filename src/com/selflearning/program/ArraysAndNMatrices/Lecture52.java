package com.selflearning.program.ArraysAndNMatrices;

import java.util.Random;

public class Lecture52 {
    public static void main(String[] args) {
        printSumOfTwoMatrix(3, 3);
    }

    public static void printSumOfTwoMatrix(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(15);

            }
        }

        int[][] matrix2 = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = random.nextInt(15);

            }
        }
        System.out.println("=============Matrix 1====================");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=============Matrix 2====================");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=============Matrix 1 +Matrix 2====================");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + matrix2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
