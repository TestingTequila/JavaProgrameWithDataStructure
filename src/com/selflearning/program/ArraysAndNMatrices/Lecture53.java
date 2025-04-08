package com.selflearning.program.ArraysAndNMatrices;

import java.util.Random;

public class Lecture53 {
    public static void main(String[] args) {
        printDiagonalOfMatrix(3, 3);
    }

    public static void printDiagonalOfMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        Random obj = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = obj.nextInt(50);

            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("======================================");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
