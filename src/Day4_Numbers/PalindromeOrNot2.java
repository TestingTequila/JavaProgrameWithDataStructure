package Day4_Numbers;

public class PalindromeOrNot2
{
    public static void main(String[] args) {
        checkPalindrome("58985");
    }

    public static void checkPalindrome(String number) {
        StringBuffer sb = new StringBuffer(number);
        String reversed= sb.reverse().toString();
        System.out.println("reversed: " + reversed);
        System.out.println(number.equals(reversed)?"Palindrome": "Not a palindrome");
    }

}
