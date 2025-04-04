package Day24_Sorting;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(bubbleSortElement(new int[]{25, 35, 15, 10, 87}, 10)));
        System.out.println(binarySearch(new int[]{25, 35, 15, 10, 87}, 7));
        int[] marks = {12, 34, 5621, 43, 5, 33};
        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));
    }

    public static int[] bubbleSortElement(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }


    public static int binarySearch(int[] numbers, int number) {
        bubbleSortElement(numbers, number);
        System.out.println(Arrays.toString(bubbleSortElement(numbers, number)));
        int myNumber = -1;
        int size = numbers.length;
        int midIndex = 0;
        if (size % 2 != 0) {
            midIndex = (size + 1) / 2;
        } else {
            midIndex = size / 2;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[midIndex] == number) {
                myNumber = numbers[midIndex];
            } else {
                if (number > numbers[midIndex]) {
                    for (int k = midIndex + 1; k < numbers.length; k++) {
                        if (numbers[k] == number) {
                            myNumber = numbers[k];
                        }
                    }
                } else {
                    for (int k = midIndex - 1; k >= 0; k--) {
                        if (numbers[k] == number) {
                            myNumber = numbers[k];
                        }
                    }
                }
            }
        }
        return myNumber;
    }

}
