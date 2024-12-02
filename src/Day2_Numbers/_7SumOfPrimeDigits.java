package Day2_Numbers;

public class _7SumOfPrimeDigits {

    public static void main(String[] args) {
        sumOfPrimeDigits(1358);
    }

    public static void sumOfPrimeDigits(int number) //13759
    {
        int sumOfPrimeDigits=0;

        while (number!=0)
        {
            int digit =number%10;
            if(digit==1||digit==3||digit==5||digit==7)
            {
                sumOfPrimeDigits=sumOfPrimeDigits+digit;//5
            }
            number=number/10;// 137
        }

        System.out.println("SUM OF PRIME DIGITS: " + sumOfPrimeDigits);
    }
}
