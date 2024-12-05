package Day15_Recursion_MI;

public class _Factorial
{
    public static void main(String[] args) {
        System.out.println(getFactorialOfANumber(5));
    }

    public static int getFactorialOfANumber(int number)
    {
        if(number==1)
        {
            return 1;
        }
        else
        {
            number = number*getFactorialOfANumber(number-1);
        }
        return number;
    }


}
