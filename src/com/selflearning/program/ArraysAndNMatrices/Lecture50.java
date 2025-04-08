package com.selflearning.program.ArraysAndNMatrices;

public class Lecture50 {
    public static void main(String[] args) {
        printLastMElements(new String[]{"Alice", "Bob", "Charlie", "Dave"}, 2);
        System.out.println("===================================");
        printLastMElements(new Integer[]{1, 2, 3, 4, 5}, 3);
        System.out.println("===================================");
        printLastMElements(new Character[]{'a', 'b', 'c', 'd'}, 2); // prints: c, d
    }

    public static <T> void printLastMElements(T[] array, int count) {
        for (int i = array.length - count; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

