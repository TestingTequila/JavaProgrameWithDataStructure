package Day20_Marix2;

import java.util.Scanner;

public class _ISwapMatrix {

    static int[][] numbers;
    int rows;
    int columns;

    public static void main(String[] args) {
        _ISwapMatrix sm = new _ISwapMatrix();
        sm.printMatrix(3, 3);
        sm.swapRowsOfMatrix(1, 2);
    }

    public void printMatrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        Scanner scanner = new Scanner(System.in);
        numbers = new int[rows][columns];
        System.out.println("Two dimensional Array Length :" + numbers.length);
        boolean isSparse = false;
        System.out.println("Enter the number.........");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        System.out.println("================MATRIX BEFORE SWAP============");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void swapRowsOfMatrix(int row1, int row2) //1, 3
    {
        int temp = 0;
        for (int i = 0; i < rows; i++) {
            temp = numbers[row1 - 1][i];
            numbers[row1 - 1][i] = numbers[row2 - 1][i];
            numbers[row2 - 1][i] = temp;
        }

        System.out.println("================MATRIX AFTER SWAP============");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
