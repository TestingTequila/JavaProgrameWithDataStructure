package Day24_Sorting;

import java.util.Arrays;

public class ImplementBubbleSort2_BetterPerformance
{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraySort(new int[]{7, 15,  45,  8,  67})));
    }

    public static int[] arraySort(int[] numbers)
    {
        for(int i=0; i<numbers.length; i++)
        {
            for(int j=0; j<numbers.length-i-1; j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]= temp;

                }
            }
        }
        return numbers;
    }
}
