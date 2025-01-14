package Day22_Patterns;

public class invertedIncrementRightTriangle
{
    public static void main(String[] args) {
        invertedDecrementingRightTriangle(10);
    }

    public static void invertedDecrementingRightTriangle(int size)
    {
        for(int i=size; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
