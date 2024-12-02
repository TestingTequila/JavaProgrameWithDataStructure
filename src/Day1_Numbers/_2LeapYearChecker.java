package Day1_Numbers;

public class _2LeapYearChecker
{
    public static void main(String[] args) {
           _2LeapYearChecker.leapYearCheck(2000);
    }

    public static void leapYearCheck(int leapYear)
    {
        if(leapYear>0)
        {
            if((leapYear%4 ==0 && leapYear%100!=0)||(leapYear%400==0)){
                System.out.println(leapYear + " is a leap year...");
            }
            else
            {
                System.out.println(" Not a leap year....");
            }
        }
        else
        {
            throw new IllegalArgumentException(leapYear + " not a leap year.....");
        }
    }
}
