package Day23_Patterns;

public class SandGlass
{
    public static void main(String[] args) {
        sandGlassStructure(10);
    }

    public static void sandGlassStructure(int maxSize)
    {
        for(int i=maxSize; i>0; i--)
        {
            for(int i1=maxSize-i; i1>0; i1--)
            {
                System.out.print(" ");
            }

            for(int j=i; j>0; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=maxSize; i++)
        {
            for(int i1=maxSize-i; i1>0; i1--)
            {
                System.out.print(" ");
            }

            for(int j=i; j>0; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
