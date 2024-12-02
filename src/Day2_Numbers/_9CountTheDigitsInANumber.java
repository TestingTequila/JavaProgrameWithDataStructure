package Day2_Numbers;

public class _9CountTheDigitsInANumber
{
    public static void main(String[] args) {
        digitsCountInNumberGiven(123431);
    }
    public static  void digitsCountInNumberGiven(int number)
    {
        int count =0;
        while (number!=0)
        {
            int digit =number%10;
            count++;
            number=number/10;
        }

        System.out.println("Count of number is: " + count);
    }
}
