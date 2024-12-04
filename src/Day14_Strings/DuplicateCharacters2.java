package Day14_Strings;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters2 {
    public static void main(String[] args) {
        consecutiveCharFinder("abcde");
    }

    public static void consecutiveCharFinder(String input) {
        boolean found = false;
        for (int i = 0; i < input.length() - 1; i++)
        {
            if (input.charAt(i) == input.charAt(i+1))
            {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
