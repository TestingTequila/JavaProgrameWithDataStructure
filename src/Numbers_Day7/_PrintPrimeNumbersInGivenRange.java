package Numbers_Day7;

public class _PrintPrimeNumbersInGivenRange
{
    public static void main(String[] args) {
        primeNumbersInGivenRange(1,12);
    }

    public static void primeNumbersInGivenRange(int startNum, int endNum)
    {

        for(int i=startNum; i<=endNum; i++) //1, 12
        {
            int count = 0;
            if (i > 1) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
