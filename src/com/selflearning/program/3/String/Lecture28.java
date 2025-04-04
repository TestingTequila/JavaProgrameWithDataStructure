package com.selflearning.program.String;

public class Lecture28 {

    public static void main(String[] args) {
        countTheWords("My name is Ashish and i am a QA Engineer");
    }

    public static void countTheWords(String sentence) {
        String[] words = sentence.split(" ");
        System.out.println(words.length);
    }
}
