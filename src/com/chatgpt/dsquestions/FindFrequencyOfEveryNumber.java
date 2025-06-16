package com.chatgpt.dsquestions;

public class FindFrequencyOfEveryNumber {
    public static void main(String[] args) {
        findFrequencyOfEveryNumber(new int[]{12, 13, 1, 12, 2, 2, 0});
    }

    public static void findFrequencyOfEveryNumber(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            System.out.println("The count of " + numbers[i] + " is " + count);
        }
    }
}
