package Day24_Sorting;

import java.util.Arrays;

public class _ISelectionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{25, 15, 10, 54, 3})));
    }

    public static int[] selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
                int temp = numbers[i];
                numbers[i] = numbers[min];
                numbers[min] = temp;
            }
        }
        return numbers;
    }
}
