package com.selflearning.arrays;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        System.out.println(checkIfArrayIsSorted(new int[]{1, 2, 3, 5, 6}));
    }

    public static String checkIfArrayIsSorted(int[] numbers) {

        String statement = "Arrays is sorted...";
        for (int i = 1; i < numbers.length; i++) {
            if (!(numbers[i - 1] < numbers[i])) {
                statement= "Not sorted...";
            }
        }
        return statement;

    }
}
