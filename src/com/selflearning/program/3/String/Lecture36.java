package com.selflearning.program.String;

public class Lecture36
{
    public static void main(String[] args) {
        System.out.println(replaceWithNextChar("password"));
    }

    public static String replaceWithNextChar(String word)
    {
        String newWord= "";
        for (int i=0; i<word.length();i++)
        {
            int number =(word.charAt(i))+1;
            newWord = newWord + (char)number;
        }
        return newWord;
    }
}
