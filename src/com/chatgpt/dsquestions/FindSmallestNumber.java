package com.chatgpt.dsquestions;

public class FindSmallestNumber {
    public static void main(String[] args) {
        findSmallestNumber(new int[]{3, 5, 6, 87, 4});
    }

    public static void findSmallestNumber(int[] numbers) {
        int min_number = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min_number) {
                min_number = numbers[i];
            }
        }
        System.out.println("min_number: " + min_number);
    }
}
