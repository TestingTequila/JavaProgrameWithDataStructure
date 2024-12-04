package Day14_Strings;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters
{
    public static void main(String[] args) {
        System.out.println( consecutiveCharFinder("abcdefghi"));
    }

    public static boolean consecutiveCharFinder(String word)
    {
        boolean duplicateExists = false;
        char[] characters =word.toCharArray();
        int ArraySize=characters.length;
        Set<Character> set = new HashSet<>();
        for(char c: characters)
        {
            set.add(c);
        }

        int setSize= set.size();
        if(ArraySize==setSize)
        {
            System.out.println("No consecutive Word exists...");
            duplicateExists =false;
        }
        else
        {
            System.out.println("Consecutive Word exists....");
            duplicateExists=true;
        }

        return duplicateExists;
    }
}
