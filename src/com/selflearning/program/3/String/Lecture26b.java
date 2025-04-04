package com.selflearning.program.String;

public class Lecture26b
{
    public static void main(String[] args) {
        reverseAString("Hello this is Jason");
    }
    public static void reverseAString(String word)
    {
        String reversedWord= "";

        for(int i=word.length()-1; i>=0; i--)
        {
            reversedWord = reversedWord + word.charAt(i);
        }

        System.out.println(reversedWord);
    }
}
