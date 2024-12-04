package Day13_Strings;

import java.util.Arrays;

public class _CheckOrder2
{
    public static void main(String[] args) {
        checkOrder("eifgh");
    }

    public static void checkOrder(String word)
    {
        char[] letters= word.toCharArray();
        Arrays.sort(letters);
        if(new String(letters).equals(word))
        {
            System.out.println("Is sorted...");
        }
        else
        {
            System.out.println("Not Sorted...");
        }

    }
}
