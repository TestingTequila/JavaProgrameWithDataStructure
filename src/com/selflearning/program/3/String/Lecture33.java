package com.selflearning.program.String;

public class Lecture33 {

    static  String newStatement ="";
    static char[] letters;
    public static void main(String[] args) {
        removeVowels("the best investment is to make ourselves");
        for(int i=0; i<letters.length; i++)
        {
             Lecture33.newStatement = newStatement + letters[i];
        }
        System.out.println(newStatement);
    }

    public static char[] removeVowels(String statement) {
        letters = statement.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u') {
                letters[i] = ' ';
            }
        }
        return letters;
    }
}
