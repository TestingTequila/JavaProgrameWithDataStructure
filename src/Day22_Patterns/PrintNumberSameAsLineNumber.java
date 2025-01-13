package Day22_Patterns;

public class PrintNumberSameAsLineNumber
{
    public static void main(String[] args) {
        printLineNumber(9);
    }

    public static void printLineNumber(int size)
    {
        for(int i=1; i<=size; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
