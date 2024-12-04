package Day14_Strings;

import java.util.Arrays;

public class ReplaceWithNextLetter
{
    public static void main(String[] args) {
        replaceWithNextCharacter("Password"); //Btijti
    }

    public static void replaceWithNextCharacter(String word)
    {
        char[] letters= word.toCharArray();
        String replacedWork="";
        for(char c : letters)
        {
            int x = (int)c;
            x= x+1;
            char c1 = (char)x;
            replacedWork = replacedWork+ c1;
        }

        System.out.println(replacedWork);
    }
}
