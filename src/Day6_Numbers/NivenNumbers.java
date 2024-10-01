package Day6_Numbers;

public class NivenNumbers
{
    public static void main(String[] args) {
        findNivenNumberOrNot(18);
        findNivenNumberOrNot(20);
        findNivenNumberOrNot(21);
        findNivenNumberOrNot(9999);
        findNivenNumberOrNot(9990);
    }

    public static void findNivenNumberOrNot(int num)
    {
        int sum = 0;
        int originalNum=num;
        while (num!=0)
        {
            int digit= num%10;
            sum = sum+digit;
            num = num/10;
        }
        if(originalNum%sum==0)
        {
            System.out.println("Is a niven Number....");
        }
        else
        {
            System.out.println("Not a niven Number....");
        }
    }
}




