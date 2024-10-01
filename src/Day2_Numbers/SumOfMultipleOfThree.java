package Day2_Numbers;

public class SumOfMultipleOfThree
{
    public static void main(String[] args) {
        additionOfMultiplesOfThree(369624);
    }

    public static void  additionOfMultiplesOfThree(int num) //369624= 24
    {
        int sumOfMultipleOfThree=0;
        while (num!=0)
        {
            int digit=num%10;
            if(digit%3==0)
            {
                sumOfMultipleOfThree = sumOfMultipleOfThree+digit;
            }
            num = num/10;
        }

        System.out.println("Sum of multiple of three is: " + sumOfMultipleOfThree);
    }
}
