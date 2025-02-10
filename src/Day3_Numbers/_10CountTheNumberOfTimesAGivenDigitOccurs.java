package Day3_Numbers;

public class _10CountTheNumberOfTimesAGivenDigitOccurs
{
    public static void main(String[] args) {
        digitOccurrenceInAGivenNumber(1234565, 5);
    }


    public static void digitOccurrenceInAGivenNumber(int number, int specificDigit)//123224
    {
        int digit;
        int count=0;

        while(number!=0)
        {
            digit =number%10;
            if(digit==specificDigit)
            {
                count++;
                number=number/10;
            }
            else
            {
                number=number/10;
            }

        }

        System.out.println("The Number " + specificDigit + " occurs for " + count + " times...");
    }
}
