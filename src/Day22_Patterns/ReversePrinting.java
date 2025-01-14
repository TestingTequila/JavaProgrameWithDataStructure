package Day22_Patterns;

public class ReversePrinting
{
    public static void main(String[] args) {
        reversePrintingAtEveryLine(10);
    }

    public static void reversePrintingAtEveryLine(int size)
    {
        for(int i=1; i<=size; i++)
        {
            for (int j=i; j>=1; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
