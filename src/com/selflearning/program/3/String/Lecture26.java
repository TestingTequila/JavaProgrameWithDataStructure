package com.selflearning.program.String;

public class Lecture26
{
    public static void main(String[] args) {
        reverseAString("Hello this is Jason");
    }
    public static void reverseAString(String word)
    {
        String reversedWord= "";
        char[] myWord= word.toCharArray();

        for(int i=myWord.length-1; i>=0; i--)
        {
            reversedWord = reversedWord + myWord[i];
        }

        System.out.println(reversedWord);
    }
}
