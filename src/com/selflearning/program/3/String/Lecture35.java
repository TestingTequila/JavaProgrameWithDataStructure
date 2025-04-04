package com.selflearning.program.String;

public class Lecture35 {
    public static void main(String[] args) {
        printWordsWithEvenLength("I thank all my students for their love and support");
    }

    public static void printWordsWithEvenLength(String statement) {
        String[] words = statement.split(" ");
        for (int i = 0; i < words.length; i++) {
            int length = words[i].length();
            if (length % 2 == 0) {
                System.out.print(words[i] + " ");
            }
        }
    }
}
