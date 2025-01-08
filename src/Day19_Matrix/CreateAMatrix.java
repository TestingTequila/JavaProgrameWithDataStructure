package Day19_Matrix;

import java.util.Scanner;

public class CreateAMatrix {
    public static void main(String[] args) {
        makeMatrix(3, 3);
    }

    public static void makeMatrix(int rows, int columns) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[rows][columns];
        System.out.println("Enter the number for matrix 1....");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        System.out.println("================MATRIX 1============");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(" ");
        }
        scanner.close();
    }
}
