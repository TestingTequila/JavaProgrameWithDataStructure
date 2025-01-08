package Day18_DS;

import java.util.Arrays;

public class SortAnArray
{
    public static void main(String[] args) {
        sortingArray(new int[]{12,32,1,54,45});
    }

    public static void sortingArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // Outer loop for passes
            for (int j = 0; j < n - i - 1; j++) { // Inner loop for comparisons
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
