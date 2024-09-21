package Numbers_Day3;

public class ReverseANumber
{
    public static void main(String[] args) {
        reversingAGivenNumber(12345);
    }


    public static void reversingAGivenNumber(int number)
    {
        String reversedNumber="";
        while (number!=0)
        {
            int digit = number%10;
            reversedNumber = reversedNumber+digit;
            number=number/10;
        }

        System.out.println(Integer.parseInt(reversedNumber));

    }
}
