package com.selflearning.program.String;

public class Lecture30
{
    public static void main(String[] args) {
        System.out.println(stringEndsWithAString("Powerful", "ful"));
    }
    public static boolean stringEndsWithAString(String word, String subWord)
    {
        boolean flag=false;
        int lengthOfWord = word.length();
        int lengthOfSubWord= subWord.length();
        int i = lengthOfWord-lengthOfSubWord;
        String newWord = "";
        for(int j=i; j<=lengthOfWord-1; j++)
        {
            newWord= newWord + word.charAt(j);
        }

        if(newWord.equals(subWord))
        {
            flag= true;
        }
        return flag;
    }
}
