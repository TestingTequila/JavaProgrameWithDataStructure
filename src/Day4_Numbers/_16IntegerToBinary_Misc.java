package Day4_Numbers;

public class _16IntegerToBinary_Misc
{
    public static void main(String[] args) {
        integerToBinary(11);
    }

    public static void integerToBinary(int number)
    {
        int[] binaryArray= new int[10];
        int i=0;
        while (number!=0)
        {
            int digit = number%2;
            binaryArray[i]=digit;
            number = number/2;
            i++;
        }

        for(int j=i-1; j>=0; j--)
        {
            System.out.println(binaryArray[j]);
        }
    }
}
