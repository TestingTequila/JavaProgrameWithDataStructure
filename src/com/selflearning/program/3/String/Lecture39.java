package com.selflearning.program.String;

public class Lecture39 {
    public static void main(String[] args) {
        findMiddleCharacter("abcdef");
    }
    private static void findMiddleCharacter(String statement) {
        int size = statement.length();
        if (size % 2 == 0) {
            System.out.println(statement.charAt((size/2)-1)+""+ statement.charAt((size / 2)));
        } else {
            System.out.println(statement.charAt((size / 2)));
        }
    }


}
