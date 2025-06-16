package com.chatgpt.dsquestions;

public class FindTheMissingNumberInBetweenOneToN {
    public static void main(String[] args) {
        findTheMissingNumberInBetweenOneToN(new int[]{1, 2, 3, 4, 5, 6, 8});
    }

    public static void findTheMissingNumberInBetweenOneToN(int[] numbers) {
        int i = 0;
        while ((numbers[i + 1] - numbers[i] == 1)) {
            i++;
        }
        System.out.println("The missing number is: " + (numbers[i] + 1));
    }
}
