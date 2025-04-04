package com.selflearning.program.String;

public class Assignment5 {
    public static void main(String[] args) {
        checkPalindrome("malayalam");
    }

    public static void checkPalindrome(String word) {
        String reversedWord = "";
        String[] original = word.split("");
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        System.out.println(reversedWord.equals(word) ? true : false);
    }
}
