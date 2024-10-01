package Day3_Numbers;

public class CheckForDuckNumber {

    public static void main(String[] args) {
        checkIfANumberIsDuckOrNot(120456);
    }


    public static void checkIfANumberIsDuckOrNot(int number)
    {
        boolean isDuckNumber=false;
        while (number!=0)
        {
            int digit = number%10;
            if(digit==0)
            {
                isDuckNumber =true;
                break;
            }
            else
            {
                number = number/10;
            }
        }

        if(isDuckNumber)
        {
            System.out.println("The Given Number is A Duck Number");
        }
        else
        {
            System.out.println("Not a Duck Number");
        }


    }
}
