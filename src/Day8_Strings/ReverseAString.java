package Day8_Strings;

import java.util.Collections;

public class ReverseAString
{
    public static void main(String[] args) {
        reverseString("Hello This is me");
    }

    public static void reverseString(String text)
    {
        System.out.println(new StringBuffer(text).reverse());
        String revText = "";
        for(int i=text.length()-1; i>=0; i--)
        {
            revText = revText+ text.charAt(i);
        }

        System.out.println(revText);
    }
}
