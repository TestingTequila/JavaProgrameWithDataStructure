package com.selflearning.program.String;

import java.util.HashSet;
import java.util.Set;

public class Lecture38 {
    public static void main(String[] args) {
        System.out.println("Duplicate consecutive character exits: "+findDuplicateConsecutiveCharacters("asdffghj"));
    }

    public static boolean findDuplicateConsecutiveCharacters(String word) {
        boolean isFound = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                isFound = true;
                System.out.println("Duplicate Character is: "+word.charAt(i));
                break;
            }
        }
        return isFound;
    }
}
