package Day3_Numbers;

public class ReverseANumber2
{
    public static void main(String[] args) {
        reversingAGivenNumber(12345);
    }


    public static void reversingAGivenNumber(int number)
    {
        int reversedNumber=0;
        while (number!=0)
        {
            int digit = number%10;
            reversedNumber = reversedNumber*10+digit;
            number=number/10;
        }

        System.out.println(reversedNumber);

    }
}
