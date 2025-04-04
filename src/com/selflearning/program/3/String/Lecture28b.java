package com.selflearning.program.String;

public class Lecture28b
{
    public static void main(String[] args) {
        countTheWords("My name is Ashish and i am a QA Engineer");
    }

    public static void countTheWords(String sentence) {

        int counter = 0;
        for(int i=0; i<sentence.length()-1; i++)
        {
            if(sentence.charAt(i)==' ')
            {
                counter++;
            }
        }

        System.out.println("Total Number of Words in given Sentence is: " + (counter+1));
    }
}
