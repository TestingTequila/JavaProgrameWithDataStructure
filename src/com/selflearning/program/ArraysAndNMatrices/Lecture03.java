package com.selflearning.program.ArraysAndNMatrices;

public class Lecture03 {
    public static void main(String[] args) {
        System.out.println(reverseAString("passworD shoulD bE protecteD"));
    }

    public static String reverseAString(String word) {
        String newWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord = newWord + word.charAt(i);
        }
        return newWord;
    }
}
