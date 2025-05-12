package com.selflearning.program.Patterns;

public class Lecture61a_Assignment {
    public static void main(String[] args) {
        invertedRightTriangleWithSameNumber(10);
    }

    public static void invertedRightTriangleWithSameNumber(int horizontal) {
        for (int i = horizontal; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
