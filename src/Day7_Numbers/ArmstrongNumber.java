package Day7_Numbers;

public class ArmstrongNumber
{
    public static void main(String[] args) {
        checkArmstrongNumber(407);
    }

    public  static void checkArmstrongNumber(int number)
    {
        int finalNumber = number;
        int sum = 0;
        while (number!=0)
        {
            int digit = number%10;
            sum = sum + digit*digit*digit;

            number = number/10;
        }

        if(sum==finalNumber)
        {
            System.out.println("The given number is an Armstrong Number...");
        }
        else
        {
            System.out.println("Not an armstrong number...");
        }
    }
}
