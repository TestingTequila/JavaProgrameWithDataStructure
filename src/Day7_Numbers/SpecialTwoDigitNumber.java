package Day7_Numbers;

public class SpecialTwoDigitNumber
{
    public static void main(String[] args) {
        specialTwoDigitNumber();
    }

    public static void specialTwoDigitNumber() //23
    {
        for (int i = 18; i <= 99; i++) {
            int temp = i;
            int sum = 0;
            int product = 1;
            while (i != 0) {
                int digit = i % 10;
                sum = sum + digit;
                product = product * digit;
                i = i / 10;
            }
            int total = sum + product;
            System.out.println(temp == total ? temp +" :Is a special Number" : temp +" :Not a special Number");
            i=temp;
        }
    }
}
