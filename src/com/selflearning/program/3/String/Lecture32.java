package com.selflearning.program.String;

public class Lecture32 {
    public static void main(String[] args) {

        if (findGold("This is Gold mine", "goldie"))
        {
            System.out.println("Given Substring exists in statement");
        }
        else {
            System.out.println("Given Substring does not exists in statement");
        }
    }

    public static boolean findGold(String statement, String subString) {
        boolean doesExists = false;
        String[] words = statement.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(subString)) {
                doesExists = true;
            }
        }
        return doesExists;
    }

}
