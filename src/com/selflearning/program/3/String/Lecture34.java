package com.selflearning.program.String;

public class Lecture34 {
    public static void main(String[] args) {
        System.out.println(addDuplicates("abcde"));
    }

    public static String addDuplicates(String word) {
        String newWord = "";
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            newWord = newWord + letters[i] + letters[i];
        }
        return newWord;
    }
}
