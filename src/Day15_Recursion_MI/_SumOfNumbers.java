package Day15_Recursion_MI;

public class _SumOfNumbers
{
    public static void main(String[] args) {
        sum(10);
    }

    public static void sum(int number)
    {
        int total=0;
        for(int i=1; i<=number; i++)
        {
            total = total + i;
        }

        System.out.println(total);
    }
}
