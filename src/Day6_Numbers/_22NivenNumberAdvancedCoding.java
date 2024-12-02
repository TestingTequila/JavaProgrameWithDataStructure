package Day6_Numbers;

public class _22NivenNumberAdvancedCoding
{
    public static void main(String[] args) {
        int originalNum=12;
        System.out.println(originalNum%findNivenNumberOrNot(12)==0?"Is a niven Number....":"Not a niven Number....");
    }

    public static int findNivenNumberOrNot(int num)
    {
        int digit, sum = 0;
        while (num!=0)
        {
             digit= num%10;
            sum = sum+digit;
            num = num/10;
        }
        return sum;
    }
}
