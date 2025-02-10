package Day23_Patterns;

public class PascalsTriangleReversePattern
{
    public static void main(String[] args) {
        reversePascalsTriangle(10);
    }

    public static void reversePascalsTriangle(int maxSize)
    {
        for(int i=1; i<=maxSize; i++)
        {
            for(int j=1; j<=maxSize-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=maxSize; i++)
        {
            for(int j=i; j>0; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=maxSize-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
