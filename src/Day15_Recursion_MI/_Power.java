package Day15_Recursion_MI;

public class _Power
{
    public static void main(String[] args) {
        System.out.println(calculateValue(3,3));
    }

    public static int calculateValue(int base, int exponent)
    {
        if(exponent<=1)
        {
            return base;
        }
        else
        {
            return base * calculateValue(base, exponent-1);
        }
    }
}
