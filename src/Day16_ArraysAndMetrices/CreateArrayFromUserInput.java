package Day16_ArraysAndMetrices;

import java.util.Arrays;

public class CreateArrayFromUserInput
{
    public static void main(String[] args)
    {
        int[] myArray= createArray(new int[]{12, 24, 45, 67, 78, 78}, 6);
        System.out.println(Arrays.toString(myArray));
    }

    public static int[] createArray(int[] marks, int count)
    {
        int[] numbers = new int[count];
        for(int i=0; i<numbers.length; i++)
        {
            numbers[i]=marks[i];
        }

        return numbers;
    }
}
