package com.chatgpt.dsquestions;

public class FindLargestNumber {
    public static void main(String[] args) {
        findLargestNumber(new int[]{-2, -4, -5, -6, -7});
    }

    public static void findLargestNumber(int[] numbers) {
        int max_number = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max_number) {
                max_number = numbers[i];
            }
        }
        System.out.println("max_number: " + max_number);
    }
}
