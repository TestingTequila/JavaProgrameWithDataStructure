package com.chatgpt.dsquestions;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        System.out.println(checkIfArrayIsSorted(new int[]{1, 2, 3, 4, 5}));
    }

    public static boolean checkIfArrayIsSorted(int[] numbers) {
        boolean isSorted = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                isSorted = false;
            }
        }
        return isSorted;
    }
}
