package Day8_Strings;

import java.util.Arrays;

public class ReverseAStatement
{
    public static void main(String[] args)
    {
        reverseStatement("Hello This is me");
    }

    public static void reverseStatement(String text)
    {
        String[] fText= text.split(" ");
        System.out.println(Arrays.toString(fText));
        String revText = "";
        for(int i= fText.length-1; i>=0; i--)
        {
            revText = revText +" "+ fText[i];
        }

        System.out.println(revText);
    }
}
