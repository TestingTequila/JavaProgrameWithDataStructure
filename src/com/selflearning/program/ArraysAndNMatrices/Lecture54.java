package com.selflearning.program.ArraysAndNMatrices;

import java.util.Random;

public class Lecture54 {
    public static void main(String[] args) {
        System.out.println(sparseMatrix(3, 3));
    }

    public static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }
        return matrix;
    }

    public static int[][] printMatrix(int rows, int columns) {
        int[][] matrix = createMatrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static boolean sparseMatrix(int rows, int columns) {
        int[][] matrix = printMatrix(rows, columns);
        int countOfElements = (rows * columns) / 2;
        boolean check = false;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    count++;
                }
            }
        }
        if (count > countOfElements) {
            check = true;
        }
        return check;
    }
}