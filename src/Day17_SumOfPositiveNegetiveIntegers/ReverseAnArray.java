package Day17_SumOfPositiveNegetiveIntegers;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        reverseAnArray(new int[]{12, 43, -56, 98, 67, 32, 66});
    }

    public static void reverseAnArray(int[] numbers) {
        int[] reversedArray = new int[numbers.length];
        int j = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (j <= numbers.length - 1) {
                reversedArray[j] = numbers[i];
                j++;
            }

        }

        System.out.println(Arrays.toString(reversedArray));
    }
}
