package Day19_Matrix;

import java.util.Scanner;

public class SumOfTwoMatrix {
    public static void main(String[] args) {
        makeMatrix(3, 3);
    }

    public static void makeMatrix(int rows, int columns) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[rows][columns];
        int[][] numbers1 = new int[rows][columns];
        int[][] numbers2 = new int[rows][columns];
        System.out.println("Enter the number for matrix 1....");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the number for matrix 2....");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the number for matrix 2....");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers2[i][j] = numbers[i][j]+numbers1[i][j];
            }
        }

        System.out.println("================MATRIX 1============");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("================MATRIX 2============");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers1[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("================MATRIX WITH SUM============");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers2[i][j] + " ");
            }
            System.out.println(" ");
        }

        scanner.close();
    }
}
