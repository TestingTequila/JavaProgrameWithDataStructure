package Day23_Patterns;

public class PascalsTrianglePattern
{
    public static void main(String[] args) {
        printPascalsTriangle(5);
    }

    public static void printPascalsTriangle(int maxSize)
    {

        for(int i=1; i<=maxSize; i++)
        {
            for(int j=1; j<=i; j++)
            {
                    System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=maxSize-1; i>0; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
