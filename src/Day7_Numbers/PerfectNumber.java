package Day7_Numbers;

public class PerfectNumber
{
    public static void main(String[] args) {
        identifyPerfectNumber(15);
    }

    public static void identifyPerfectNumber(int number)
    {
        int finalNumber = number;
        int sum=0;
        for(int i=2; i<number; i++)
        {
            if(number%i==0)
            {
                sum = sum + i;
            }
        }

        if(sum+1==finalNumber)
        {
            System.out.println("Is a perfect Number....");
        }
        else
        {
            System.out.println("Not a perfect Number....");
        }
    }
}


