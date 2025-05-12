package com.selflearning.program.Patterns;

public class Lecture61 {
    public static void main(String[] args) {
        invertedRightTriangle(20);
    }

    public static void invertedRightTriangle(int horizontal) {
        for (int i = horizontal; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
