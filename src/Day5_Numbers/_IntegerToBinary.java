package Day5_Numbers;

public class _IntegerToBinary
{
    public static void main(String[] args) {
        integerToBinaryConversion(11);
    }

    public static void integerToBinaryConversion(int number)
    {
        int digits[] = new int[10];
        int i =0;
        while (number!=0)
        {
            int digit =number%2;
            digits[i]=digit;
            i++;
            number = number/2;
        }


        for (int j = i-1; j>=0; j--)
        {
            System.out.print(digits[j]);
        }

    }
}
