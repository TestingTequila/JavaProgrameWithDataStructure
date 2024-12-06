package Day16_ArraysAndMetrices;

public class PrintEvenNumbers
{
    public static void main(String[] args) {
        int sumOfEvenNumber =printSumOfEvenNumber(new int[]{1,2,3,4,5,6});
        System.out.println("sumOfEvenNumber: " + sumOfEvenNumber);
    }

    public static int printSumOfEvenNumber(int[] numbers)
    {
        int total = 0;
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]%2==0)
            {
                total = total + numbers[i];
            }
        }

        return total;
    }
}
