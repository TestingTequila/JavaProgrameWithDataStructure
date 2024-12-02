package Day1_Numbers;

public class _4PrintDigitsInANumber
{

    public static void main(String[] args) {
      _4PrintDigitsInANumber.printDigitsOfaGiverNumber(546789231);
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
