package Day2_Numbers;

public class _6SumOfEvenOddNumbers
{
    public static void main(String[] args) {
        _6SumOfEvenOddNumbers.sumOfEvenOddNumbers(5);
    }

    public static void sumOfEvenOddNumbers(int num)
    {
        int sumOfEvenNumbers=0;
        int getSumOfOddNumbers=0;

        for(int i=1; i<=num;i++)
        {
            if(i%2==0)
            {
                sumOfEvenNumbers=sumOfEvenNumbers+i;
            }
            else
            {
                getSumOfOddNumbers=getSumOfOddNumbers+i;
            }
        }

        System.out.println(sumOfEvenNumbers);
        System.out.println(getSumOfOddNumbers);
    }
}
