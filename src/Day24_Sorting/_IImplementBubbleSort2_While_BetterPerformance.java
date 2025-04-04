package Day24_Sorting;

import java.util.Arrays;

public class _IImplementBubbleSort2_While_BetterPerformance {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraySort(new int[]{7, 15, 45, 8, 67})));
    }

    public static int[] arraySort(int[] numbers) {
        int i = 0;
        boolean swapped =true;

        while (swapped) {
            swapped =false;
            i++;
                for (int j = 0; j < numbers.length - i; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                        swapped=true;
                    }
                }
            }
        return numbers;
    }
}
