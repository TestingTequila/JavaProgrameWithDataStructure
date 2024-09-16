package Numbers_Day1;

public class SumOfDigitsInANumber
{
    public static void main(String[] args) {
       SumOfDigitsInANumber.sumOfDigits(12345);
    }

    public static void sumOfDigits(int number)
    {
        int digit;
        int sum=0;

        while (number!=0)
        {
            digit =number%10;
            sum = sum + digit;
            number= number/10;

        }

        System.out.println(sum);
    }
}


