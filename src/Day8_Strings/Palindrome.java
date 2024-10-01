package Day8_Strings;

public class Palindrome
{
    public static void main(String[] args) {
        isPalindrome("malayalam");
    }

    public static void isPalindrome(String text)
    {
        String reverseText="";
        for(int i=text.length()-1; i>=0; i--)
        {
            reverseText = reverseText+ text.charAt(i);
        }

        System.out.println(text.equals(reverseText)? text+ " is a palindrome": text+ " is not a palindrome");
    }
}
