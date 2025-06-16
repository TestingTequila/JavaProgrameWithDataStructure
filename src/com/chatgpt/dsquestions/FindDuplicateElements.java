package com.chatgpt.dsquestions;

public class FindDuplicateElements {
    public static void main(String[] args) {
        findDuplicateElements(new int[]{23, 45, 6, 7, 45, 6, 7});
    }

    public static void findDuplicateElements(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i] + " is a duplicate Number....");
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                }
            }
        }
    }
}
