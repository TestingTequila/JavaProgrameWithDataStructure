package com.selflearning.program.String;

public class Lecture33b {

    static String newStatement = "";
    static char[] letters;
    public static void main(String[] args) {
        System.out.println(removeVowels("the best investment is to make ourselves"));
    }
    public static String removeVowels(String statement) {
        String newStatement = "";
        letters = statement.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (!(letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u')) {
                newStatement = newStatement + letters[i];
            }
        }
        return newStatement;
    }
}
