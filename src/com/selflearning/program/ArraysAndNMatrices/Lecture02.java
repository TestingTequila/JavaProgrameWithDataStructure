package com.selflearning.program.ArraysAndNMatrices;

public class Lecture_02 {
    public static void main(String[] args) {
        firstAndLastCharactersAreSameInAnArray(new char[]{'a', 'e', 'i', 'o', 'u', 'a'});
    }

    public static void firstAndLastCharactersAreSameInAnArray(char[] letters) {
            if (letters[0] == letters[letters.length - 1]) {
                System.out.println(letters[0] + ", is same as: " + letters[letters.length - 1]);
            }

    }
}
