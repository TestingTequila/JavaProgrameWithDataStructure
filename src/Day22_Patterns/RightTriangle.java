package Day22_Patterns;

public class RightTriangle
{
    public static void main(String[] args) {
        printRightTriangle(10);
    }

    public static void printRightTriangle(int size)
    {
        for(int i=1; i<=size; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
