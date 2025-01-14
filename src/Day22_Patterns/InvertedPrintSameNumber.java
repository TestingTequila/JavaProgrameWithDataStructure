package Day22_Patterns;

public class InvertedPrintSameNumber
{
    public static void main(String[] args) {
        invertedDecrementRightTriangle(10);
    }

    public static void invertedDecrementRightTriangle(int size)
    {
        for(int i=size; i>=1; i--)
        {
            for(int j =i; j>=1; j--)
            {
                System.out.print(i + " ");
            }

            System.out.println();

        }
    }
}
