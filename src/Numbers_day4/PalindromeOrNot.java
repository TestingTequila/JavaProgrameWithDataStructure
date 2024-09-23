package Numbers_day4;

public class PalindromeOrNot
{
    public static void main(String[] args) {
        checkPalindrome(58985);
    }

    public static void checkPalindrome(int number)//
    {
        int reversedNumber=0;
        int tempNum= number;
          while(number!=0)
          {
              int digit = number%10;
              reversedNumber=reversedNumber*10+digit;
              number =number/10;
          }

          if(reversedNumber==tempNum)
          {
              System.out.println("Number is Palindrome");
          }
          else {
              System.out.println("Not a Palindrome....");
          }
    }
}
