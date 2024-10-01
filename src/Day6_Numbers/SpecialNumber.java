package Day6_Numbers;

public class SpecialNumber
{
    public static void main(String[] args) {
        isSpecialTwoDigitNumber(59);
    }

    public static void isSpecialTwoDigitNumber(int number)
    {
        int sum=0, product=1, originalNumber=number;
        while (number!=0)
        {
            int digit= number%10;
            sum = sum+digit;
            product = product*digit;

            number = number/10;
        }

        System.out.println(sum+product==originalNumber?"Is a special Number":"Not a special number...");
    }
}
