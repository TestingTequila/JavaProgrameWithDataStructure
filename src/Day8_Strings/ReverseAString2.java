package Day8_Strings;

public class ReverseAString2
{
    public static void main(String[] args) {
        reverseString("Hello This is me");
    }

    public static void reverseString(String text)
    {
        System.out.println(new StringBuffer(text).reverse());
    }
}
