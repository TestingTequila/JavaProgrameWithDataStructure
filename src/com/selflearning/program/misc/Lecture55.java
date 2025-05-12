package com.selflearning.program.misc;

import java.util.Random;

public class Lecture55 {
    public static void main(String[] args) {
        swapRows(createMatrix(3, 3), 2, 3);
    }

    public static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(9);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==========================================");
        return matrix;
    }

    public static void swapRows(int[][] matrix, int row1, int row2) {
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                temp = matrix[row1 - 1][j];
                matrix[row1 - 1][j] = matrix[row2 - 1][j];
                matrix[row2 - 1][j] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
