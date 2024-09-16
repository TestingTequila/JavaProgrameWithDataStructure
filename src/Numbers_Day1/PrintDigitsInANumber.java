package Numbers_Day1;

public class PrintDigitsInANumber
{

    public static void main(String[] args) {
      PrintDigitsInANumber.printDigitsOfaGiverNumber(546789231);
    }

    public static void printDigitsOfaGiverNumber(int number)
    {
        System.out.println("The number is " + number + " and digits are: ");
        int digit;
        while (number!=0)
        {
            digit = number%10;
            System.out.print(digit+" ");
            number = number/10;
        }
    }
}
