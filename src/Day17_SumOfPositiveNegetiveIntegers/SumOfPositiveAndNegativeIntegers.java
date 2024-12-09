package Day17_SumOfPositiveNegetiveIntegers;

public class SumOfPositiveAndNegativeIntegers
{
    public static void main(String[] args) {
        sumOfNegativePositiveIntegers(new int[]{12, -12, 2, -2, 34, -34});
    }

    public static void sumOfNegativePositiveIntegers(int[] numbers)
    {
        int positiveSum=0;
        int negativeSum = 0;
        for (int i=0; i<numbers.length; i++)
        {
            if(numbers[i]>=0)
            {
                positiveSum = positiveSum+numbers[i];
            }
            else
            {
                negativeSum = negativeSum+numbers[i];
            }
        }

        System.out.println("Positive Numbers Sum is: " + positiveSum);
        System.out.println("Negative Numbers Sum is: " + negativeSum);
    }

}
